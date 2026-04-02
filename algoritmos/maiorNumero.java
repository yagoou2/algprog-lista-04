import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Insira o cinco números inteiros(Aperte ENTER após cada número): ");
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       int n4 = sc.nextInt();
       int n5 = sc.nextInt();

       int maiorNum = Math.max(n1, Math.max(n2, Math.max(n3,Math.max(n4, n5))));
       
       System.out.println("O maior número é: "+maiorNum);

       sc.close();
    }
}