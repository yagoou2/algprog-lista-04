import java.util.Scanner;

public class PopulacaoV2ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("\n--- Ajuste de Crescimento Populacional ---");

            // Validação da primeira população
            double populacaoA;
            do {
                System.out.print("Informe a população do país A: ");
                populacaoA = sc.nextDouble();
                if (populacaoA <= 0) System.out.println("Erro: A população deve ser maior que 0.");
            } while (populacaoA <= 0);

            System.out.print("Informe a taxa de crescimento de A (ex: 3 para 3%): ");
            double taxaA = sc.nextDouble() / 100;

            // Validação da segunda população
            double populacaoB;
            do {
                System.out.print("Informe a população do país B: ");
                populacaoB = sc.nextDouble();
                if (populacaoB <= 0) System.out.println("Erro: A população deve ser maior que 0.");
            } while (populacaoB <= 0);

            System.out.print("Informe a taxa de crescimento de B (ex: 1.5 para 1.5%): ");
            double taxaB = sc.nextDouble() / 100;

            int anos = 0;

            // Lógica para evitar loop infinito se A nunca alcançar B
            if (populacaoA < populacaoB && taxaA <= taxaB) {
                System.out.println("\n[Aviso] Com essas taxas, o país A nunca alcançará o país B.");
            } else {
                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * taxaA;
                    populacaoB += populacaoB * taxaB;
                    anos++;
                }
                System.out.println("\nResultado final:");
                System.out.println("Levará " + anos + " anos para A igualar ou ultrapassar B.");
            }

            System.out.print("\nDeseja realizar outro cálculo? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado. Bons estudos na UNA!");
        sc.close();
    }
}