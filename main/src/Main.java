import User.UserController;

import java.util.Objects;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        boolean program_state = true;

        while(program_state){
            System.out.println("Bem-vindo ao Sistema Gerenciador de Usuários");
            System.out.println("O que você deseja fazer?");
            System.out.println("[1] - Inserir Usuário(s)");
            System.out.println("[2] - Editar Usuário(s)");
            System.out.println("[3] - Listar Usuário(s)");
            System.out.println("[4] - Deletar Usuário(s)");
            System.out.println("[5] - Buscar Usuário");
            System.out.println("[6] - Sair");

            String option = scanner.next();
            System.out.println("Você escolheu a opção " + option);
            if(Objects.equals(option, "6")){
                program_state = false;
            } else {
                if(Objects.equals(option, "1")){
                    userController.createUser();
                }

                if(Objects.equals(option, "2")){
                    System.out.println("Qual usuário você quer editar?");
                    int editUser = scanner.nextInt();
                    userController.editUser(editUser);
                }

                if(Objects.equals(option, "3")){
                    System.out.println("Listando usuários:");
                    userController.getUsers();
                }

                if(Objects.equals(option, "4")){
                    System.out.println("Qual usuário você quer deletar?");
                    int deleteUser = scanner.nextInt();
                    userController.deleteUser(deleteUser);
                }

                if(Objects.equals(option, "5")){
                    System.out.println("Qual usuário você deseja buscar?");
                    String searchTerm = scanner.next();
                    userController.getUser(searchTerm);
                 }
            }

        }
    }
}