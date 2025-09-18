package User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();
    private int id = 1;

    public void addUser(String nome, String email, String password, String role){
        User user = new User(id, nome, email, password, role);
        users.add(user);
        id++;
        System.out.println("Novo usuário cadastrado com sucesso!");
    }

    public void getUsers(){
        System.out.println(users);
    }

    public void editUser(int id){
        System.out.println("Dados atuais:");
        System.out.println(users.get(id-1));
    }

    public void deleteUser(int id){
        System.out.println("Deletando usuário " + id + "...");
        users.remove(id-1);
    }
}
