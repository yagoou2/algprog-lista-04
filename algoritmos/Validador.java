import java.util.Scanner;
public class Validador {
    public static void main(String[] args) {
        String nome;
        String estadoCivil;
        int idade;
        String sexo;
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo Usuário, esse é o validador X");
        System.out.println("Aqui vamos validar nome, idade, estado civíl, salário e sexo");
        System.out.println("Mas claro, com condições especiais.");
        System.out.println("Para começar, digite seu nome, deve possuir mais de 3 caracteres.");
        nome = sc.nextLine();
        nome = nome.trim();
        if(nome.length() <3){
            System.out.println("Seu nome possui menos dde 3 caracteres, inálido");
        }
        else{
            System.out.println("Computado!, seu nome é "+nome);
        }
        System.out.println("Ok, "+nome+" agora precisamos validar sua idade, ela deve ser entre 0 e 150 anos");
        System.out.println("Quantos anos você tem?: ");
        idade = sc.nextInt();

        if(idade <= 0 && idade >= 150){
            System.out.println("Idade Inválida!");
        }
        else{
            System.out.println("Computado!, você tem "+idade+" anos!");
        }
        System.out.println("Ok, agora precisamos computar seu gênero, aqui apenas aceitamos F, ou M,(feminino ou masculino)");
        System.out.println("Qual é seu gênero?");
        sc.nextLine();
        sexo = sc.nextLine();
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("Computado! você é do gênero feminino!");
        }
        else if(sexo.equalsIgnoreCase("m")){
            System.out.println("Computado!, você é do gênero Masculino");
        }
        else{
            System.out.println("Gênero invalido!, Tente novamente!");
        }
        System.out.println("Agora vamos validar seu estádo civíl para finalizar, aqui nos aceitamos:");
        System.out.print(" C(casado), S(solteiro), V(viuva), D (divorciado)");
        System.out.println("Qual é seu estado civíl?: ");
        estadoCivil = sc.nextLine();
        if(estadoCivil.equalsIgnoreCase("s")){
            System.out.println("Você é solteiro(a)");
        }
        else if(estadoCivil.equalsIgnoreCase("c")){
            System.out.println("Você é casado(a)!");
        }
        else if(estadoCivil.equalsIgnoreCase("v")){
            System.out.println("Você é viúvo(a)");
        }
        else if(estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Você é divorciado(a)");

        }
        System.out.println("Agora, por fim, temos de validar seu salário mensal");
        System.out.println("Digite aqui, seu salário em reais, ele deve ser maior que zero.");
        salario = sc.nextDouble();
        if(salario == 0){
            System.out.println("O salário não pode ser zero tente novamente");
        }
        else{
            System.out.println("Computado, seu salário mensal é de: "+salario+" reais.");
        }

        System.out.println("Você se chama: "+nome+" você tem "+idade+ " anos"+ " seu estádo civíl abreviado é: "+estadoCivil+" e seu sexo abreviado é: "+ sexo + " e você ganha "+ salario+"por mês.");
        System.out.println("Acabou, fim do programa.");

        sc.close();

    }
}
