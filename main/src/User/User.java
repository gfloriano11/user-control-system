package User;

public class User {

    private int id;
    public String name;
    public String email;
    private String password;
    public String role;

    public User(int userId, String userName, String userEmail, String userPass, String userRole){
        this.id = userId;
        this.name = userName;
        this.email = userEmail;
        this.password = userPass;
        this.role = userRole;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return id + ", " + name + ", " + email + ", " + password + ", " + role;
    }
}
