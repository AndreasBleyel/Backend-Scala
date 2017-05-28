package controllers;

import models.Projekt;
import models.Task;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;



public class UserController extends Controller {

    @Inject
    public FormFactory formFactory;



    public Result list(){
        List<User> userList = User.find.all();
        return ok(views.html.userlist.render(userList));
    }

    public Result show(Long id){
        User user = User.find.byId(id);

        List<Task> taskList = Task.find.where().like("user_id", user.getId().toString()).findList();

        return ok(views.html.user.render(user, taskList));
    }

    public Result create(){
        Form<User> userForm = formFactory.form(User.class);
        User user = userForm.bindFromRequest().get();

        System.out.println(user.groupsholder);
        List<Projekt> tmpGroups = new ArrayList<>();
        for(String id : user.groupsholder){
            Projekt grp = Projekt.find.byId(Long.parseLong(id));
            tmpGroups.add(grp);
        }
        user.setGroupList(tmpGroups);

//        String tmpGroupId = user.getGroup().toString();
//        Projekt tmpGroup = Projekt.find.byId(Long.parseLong(tmpGroupId));
//        user.setGroup(tmpGroup);

        user.save();
        return redirect(routes.UserController.list());
    }

    public Result update(Long id){
        return ok("update");
    }

    public Result delete(Long id){
        User.find.byId(id).delete();
        return redirect(routes.UserController.list());
    }

    public Result newUser(){
        Form<User> userForm = formFactory.form(User.class);
        List<Projekt> groupList = Projekt.find.all();
        return ok(views.html.newuser.render(userForm, groupList));
    }

}
