package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by andi on 29.05.17.
 */
@Entity
public class Customer extends Model {

    @Id
    @Column(name = "customer_id")
    private Long id;

    private String firstname;
    private String lastname;
    private String email;

    @Transient
    List<String> projektListholder;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Projekt> projektList;

    public static Finder<Long, Customer> find = new Finder<Long, Customer>(Customer.class);

    public Customer(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Projekt> getProjektList() {
        return projektList;
    }

    public void setProjektList(List<Projekt> projektList) {
        this.projektList = projektList;
    }

    public List<String> getProjektListholder() {
        return projektListholder;
    }

    public void setProjektListholder(List<String> projektListholder) {
        this.projektListholder = projektListholder;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", this.getFirstname(), this.getLastname(), this.getEmail());

    }
}
