package controllers;

import models.Projekt;
import models.Search;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * Created by andi on 30.05.17.
 */
public class SearchController extends Controller {

    @Inject
    public FormFactory formFactory;
    
    public Result showSearch(){
        Form<Search> searchForm = formFactory.form(Search.class);
        return ok(views.html.search.render(searchForm));
    }

    public Result search(){
        Form<Search> loginForm = formFactory.form(Search.class);
        Search search = loginForm.bindFromRequest().get();

        Projekt projekt = Projekt.find.where().like("projektName",search.getSuchbegriff()).findUnique();
        if(projekt == null)
            return notFound();
        else
            return redirect(routes.ProjektController.show(projekt.getId()));
    }
}
