import java.util.Scanner;

public class ValidadorDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.println("BEM Vindo(a) ao ValidadorDeNotas");
            System.out.println("Digite aqui sua nota entre 0 e 10:");
            nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Valeu, so nice!");
            } else {
                System.out.println("Você digitou uma nota impossível, tente novamente.");
            }

        } while (nota < 0 || nota > 10); 

        sc.close();
    }
}