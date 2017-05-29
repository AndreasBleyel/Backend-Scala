package controllers;

import models.Projekt;
import models.Customer;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andi on 29.05.17.
 */
public class CustomerController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result list(){
        List<Customer> customerList = Customer.find.all();

        return ok(views.html.customerlist.render(customerList));
    }

    public Result show(Long id){
        Customer customer = Customer.find.byId(id);

        return ok(views.html.customer.render(customer));
    }

    public Result create(){
        Form<Customer> customerForm = formFactory.form(Customer.class);

        Customer customer = customerForm.bindFromRequest().get();

        List<Projekt> tmpProjekts = new ArrayList<>();
        for(String id : customer.getProjektListholder()){
            Projekt grp = Projekt.find.byId(Long.parseLong(id));
            tmpProjekts.add(grp);
        }
        customer.setProjektList(tmpProjekts);

        for (Projekt tmpProjekt : tmpProjekts){
            Projekt projekt = Projekt.find.byId(tmpProjekt.getId());
            projekt.setCustomer(customer);
            projekt.save();
        }

        customer.save();

        for (Projekt tmpProjekt : tmpProjekts){
            Projekt projekt = Projekt.find.byId(tmpProjekt.getId());
            projekt.setCustomer(customer);
            projekt.save();
        }

        return redirect(routes.CustomerController.list());
    }

    public Result editCustomer(Long id){
        Form<Customer> customerForm = formFactory.form(Customer.class).fill(Customer.find.byId(id));
        List<Projekt> projektList = Projekt.find.all();
        return ok(views.html.editcustomer.render(customerForm, projektList, id));
    }

    public Result update(Long id){

        Form<Customer> customerForm = formFactory.form(Customer.class);
        Customer oldCustomer = Customer.find.byId(id);

        Customer updatedCustomer = customerForm.bindFromRequest().get();

        List<Projekt> tmpProjekts = new ArrayList<>();
        for(String projektId : updatedCustomer.getProjektListholder()){
            Projekt grp = Projekt.find.byId(Long.parseLong(projektId));
            tmpProjekts.add(grp);
        }
        updatedCustomer.setProjektList(tmpProjekts);

        oldCustomer.setLastname(updatedCustomer.getLastname());
        oldCustomer.setFirstname(updatedCustomer.getFirstname());
        oldCustomer.setEmail(updatedCustomer.getEmail());

        for (Projekt tmpProjekt : oldCustomer.getProjektList()){
            Projekt projekt = Projekt.find.byId(tmpProjekt.getId());

            if(!tmpProjekts.contains(projekt)){
                projekt.setCustomer(null);
            }

            projekt.save();
        }

        oldCustomer.getProjektList().clear();
        oldCustomer.setProjektList(updatedCustomer.getProjektList());

        oldCustomer.save();



        return redirect(routes.CustomerController.list());
    }

    public Result delete(Long id){
        Customer.find.byId(id).delete();
        return redirect(routes.CustomerController.list());
    }

    public Result newCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        List<Projekt> projektList = Projekt.find.all();
        return ok(views.html.newcustomer.render(customerForm, projektList));
    }
}
