import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Gerenciador de Usuários");
        System.out.println("O que você deseja fazer?");
        System.out.println("[1] - Inserir Usuário(s)");
        System.out.println("[2] - Editar Usuário(s)");
        System.out.println("[3] - Visualizar Usuário(s)");
        System.out.println("[4] - Deletar Usuário(s)");

        String option = scanner.next();
        System.out.println("Você escolheu a opção " + option);
    }
}