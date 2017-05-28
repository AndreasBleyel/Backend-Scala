package controllers;

import models.Login;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * Created by andi on 28.05.17.
 */
public class LoginController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result login() {

        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(views.html.login.render(loginForm));
    }

    public Result authenticate(){
        Form<Login> loginForm = formFactory.form(Login.class);
        Login login = loginForm.bindFromRequest().get();

        User user = User.find.where().like("email", login.getEmail()).findUnique();
        if(user != null && user.getPassword().equals(login.getPassword())){
            return redirect(routes.HomeController.index());
        }
        else {
            return redirect(routes.LoginController.login());
        }

    }

}
