public class Populacao {
    public static void main(String[] args) {
        double popA = 80000;
        double taxaA = 0.03; 
        double popB = 200000;
        double taxaB = 0.015; 
        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

        System.out.println("Levará " + anos + " anos para o País A ultrapassar o País B.");
        System.out.printf("População A: %.0f | População B: %.0f\n", popA, popB);
    }
}