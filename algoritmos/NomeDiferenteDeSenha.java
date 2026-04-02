import java.util.Scanner;
public class NomeDiferenteDeSenha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUser;
        String senhaUser;
        do{
        System.out.println("Bem vindo ao jogo X user!");
        System.out.println("aqui vamos lhe pedir nick(nome) e senha");
        System.out.println("porém lembre-se que nome não pode ser igual a senha por segurança");

        System.out.println("qual é seu nome?");
        nomeUser = sc.nextLine();

        System.out.println("qual é sua senha?");
        senhaUser = sc.nextLine();

        if( senhaUser.equalsIgnoreCase(nomeUser)){
            System.out.println("ei cara vc desrespeitou a regra, vamos redirecionar você para o início para tentar novamente!");
            System.out.println("redirecionando...");

        }
        if( !senhaUser.equalsIgnoreCase(nomeUser)){ 
            System.out.println("Bem vindo de volta, "+ nomeUser + " vamos te redirecionar para a página main agora...");
            System.out.println("redirecionando...");
        }

        }
        while(senhaUser.equalsIgnoreCase(nomeUser));
        sc.close();
    }
}