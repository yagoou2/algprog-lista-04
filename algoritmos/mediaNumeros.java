import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Insira o cinco números inteiros(Aperte ENTER após cada número): ");
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       int n4 = sc.nextInt();
       int n5 = sc.nextInt();
       
       int soma = n1 + n2 + n3 + n4 + n5;
       double media = soma / 5.0;

       System.out.println("A soma destes números é: "+soma+"\nE a média destes numeros é: "+media);

       sc.close();
    }
    
}
