package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserController {
    private List<User> users = new ArrayList<>();
    private int id = 1;
    Scanner scanner = new Scanner(System.in);

    public void createUser(){
        System.out.println("Insira os dados do usuário:");
        System.out.println("Nome:");
        String name = scanner.next();
        System.out.println("E-mail:");
        String email = scanner.next();
        System.out.println("Password:");
        String password = scanner.next();
        System.out.println("Função:");
        System.out.println("[1] - Administrador");
        System.out.println("[2] - Colaborador");
        int role = scanner.nextInt();
        while(role != 1 && role != 2){
            System.out.println("Função inválida. Digite novamente:");
            System.out.println("[1] - Administrador");
            System.out.println("[2] - Colaborador");
            role = scanner.nextInt();
        }
        String textRole = "Colaborador";
        if(role == 1){
            textRole = "Administrador";
        }

        addUser(name, email, password, textRole);
    }

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
        System.out.println("Insira os novos dados do usuário:");
        System.out.println("Nome:");
        String name = scanner.next();
        System.out.println("E-mail:");
        String email = scanner.next();
        System.out.println("Password:");
        String password = scanner.next();
        System.out.println("Função:");
        System.out.println("[1] - Administrador");
        System.out.println("[2] - Colaborador");
    }

    public void deleteUser(int id){
        System.out.println("Deletando usuário " + id + "...");
        users.remove(id-1);
    }
}
