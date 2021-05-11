package Model;

public class User {

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String email;

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

    String password;

    public boolean isDataValid(){
        if(getEmail().toLowerCase().contains("test") && getPassword().toLowerCase().contains("test")){
            return true;
        }
        return false;
    }
}
