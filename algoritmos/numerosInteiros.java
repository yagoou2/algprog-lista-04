import java.util.Scanner;
public class numerosInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros(Aperte ENTER após cada número): ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int numMaior = Math.max(n1, n2);
        int numMenor = Math.min(n1, n2);

        for (int i = numMenor + 1; i < numMaior; i++){
            System.out.print(i+ " ");
        }

        sc.close();
    }
}
