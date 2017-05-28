package controllers;

import models.Task;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by paulaengelberg on 28.05.17.
 */
public class TaskController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result newTask() {
        Form<Task> taskForm = formFactory.form(Task.class);
        List<User> userList = User.find.all();
        return ok(views.html.newtask.render(taskForm, userList));
    }

    public Result list() {
        List<Task> taskList = Task.find.findList();
        return ok(views.html.tasklist.render(taskList));
    }

    public Result create() {
        Form<Task> taskForm = formFactory.form(Task.class);
        Task task = taskForm.bindFromRequest().get();

        User user = User.find.byId(Long.parseLong(task.getTempUser()));
        task.setUser(user);

        task.save();
        return redirect(routes.TaskController.list());
    }
}