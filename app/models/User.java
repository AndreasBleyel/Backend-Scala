package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class User extends Model {
    @Id
    @Column(name="user_id")
    private Long id;

    private String firstname;
    private String lastname;
    private String gender;
    private String email;
    private String password;

    @Transient
    public List<String> groupsholder;

    @ManyToMany
    private List<Projekt> groupList;


    public User(){

    }

    public User(Long id, String firstname, String lastname, String gender, String email, String password) {
        this.setId(id);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setGender(gender);
        this.setEmail(email);
        this.setPassword(password);
    }

    @Override
    public String toString(){


        return String.format("%s %s (%s)", this.getFirstname(), this.getLastname(), this.getEmail());
    }

    public static Finder<Long, User> find = new Finder<Long, User>(User.class);

    public String userVorNachname (){
        return String.format("%s %s", this.getFirstname(), this.getLastname());
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Projekt> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Projekt> groupList) {
        this.groupList = groupList;
    }

    public List<String> getGroupsholder() {
        return groupsholder;
    }

    public void setGroupsholder(List<String> groupsholder) {
        this.groupsholder = groupsholder;
    }
}
