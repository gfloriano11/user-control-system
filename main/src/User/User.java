package User;

public class User {

    private int id;
    public String name;
    private String email;
    private String password;
    public boolean role;

    public User(int userId, String userName, String userEmail, String userPass, boolean userRole){
        this.id = userId;
        this.name = userName;
        this.email = userEmail;
        this.password = userPass;
        this.role = userRole;
    }
}
