public class User {

    private int id;
    public String name;
    private String email;
    private String password;

    public User(int userId, String userName, String userEmail, String userPass){
        this.id = userId;
        this.name = userName;
        this.email = userEmail;
        this.password = userPass;
    }
}
