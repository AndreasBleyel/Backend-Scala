package controllers;

import models.Projekt;
import models.Task;
import models.User;
import org.springframework.core.ResolvableType;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulaengelberg on 28.05.17.
 */
public class TaskController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result list() {
        List<Task> taskList = Task.find.findList();
        return ok(views.html.tasklist.render(taskList));
    }

    public Result show(Long id){
        Task task = Task.find.byId(id);
        return ok(views.html.task.render(task));
    }

    public Result newTask() {
        Form<Task> taskForm = formFactory.form(Task.class);
        List<User> userList = User.find.all();
        List<Projekt> projektList = Projekt.find.all();
        return ok(views.html.newtask.render(taskForm, userList, projektList));
    }

    public Result create() {
        Form<Task> taskForm = formFactory.form(Task.class);
        Task task = taskForm.bindFromRequest().get();

        Projekt projekt = Projekt.find.byId(Long.parseLong(task.getTempProjekt()));
        task.setProjekt(projekt);

        User user = User.find.byId(Long.parseLong(task.getTempUser()));
        task.setUser(user);

        task.save();
        return redirect(routes.TaskController.list());
    }

    public Result editTask(Long id) {
        Form<Task> taskForm = formFactory.form(Task.class).fill(Task.find.byId(id));
        List<User> userList = User.find.all();
        List<Projekt> projektList = Projekt.find.all();

        return ok(views.html.edittask.render(taskForm, userList, projektList, id));
    }

    public Result update(Long id) {

        Form<Task> taskForm = formFactory.form(Task.class);
        Task oldTask = Task.find.byId(id);

        Task updatedTask = taskForm.bindFromRequest().get();

        Projekt projekt = Projekt.find.byId(Long.parseLong(updatedTask.getTempProjekt()));
        updatedTask.setProjekt(projekt);

        User user = User.find.byId(Long.parseLong(updatedTask.getTempUser()));
        updatedTask.setUser(user);

        oldTask.setTaskName(updatedTask.getTaskName());
        oldTask.setDuration(updatedTask.getDuration());
        oldTask.setProjekt(updatedTask.getProjekt());
        oldTask.setUser(updatedTask.getUser());
        oldTask.save();

        return redirect(routes.TaskController.list());
    }

    public Result delete(Long id){
        Task.find.byId(id).delete();
        return redirect(routes.TaskController.list());
    }
}