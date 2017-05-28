package models;

/**
 * Created by andi on 28.05.17.
 */
public class Login {

    private String email;
    private String password;

    public Login(){};

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

    @Override
    public String toString() {
        return String.format("%s %s", this.getEmail(), this.getPassword());

    }
}
