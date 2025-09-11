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

                    userController.addUser(name, email, password, textRole);
                }

                if(Objects.equals(option, "3")){
                    System.out.println("Listando usuários:");
                    userController.getUsers();
                }

            }

        }
    }
}