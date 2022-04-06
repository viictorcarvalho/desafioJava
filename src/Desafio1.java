import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
        
    String nomeHabitante = "";
    String profissao = "";

    float[] salario = new float[12];
    float[] taxaImposto = new float[salario.length];
        
        for (int i = 0; i < salario.length; i++) {
        System.out.println ("Valor do seu " + (i+1) + "° salário" );
        salario[i]= leitor.nextFloat();
        }
        for (int i = 0; i < taxaImposto.length; i++) {
            if (salario[i] <= 2000.00) {
                taxaImposto[i] = 0;

            } else if (salario[i] <= 3000.00) {
                taxaImposto[i] = (salario[i] / 100) * 8;

            } else if (salario[i] <= 4500.00) {
                taxaImposto[i] = (salario[i] / 100) * 18;

            } else if (salario[i] >= 4500.00) {
                taxaImposto[i] = (salario[i] / 100) * 28;
            }
        }
        while (true) {
            System.out.println("");
            System.out.println("------------------------------------------------------");
            System.out.println("Menu:");
            System.out.println("------------------------------------------------------");
            System.out.println("Para cadastrar um novo usúario, digite 1");
            System.out.println("Para exibir salário, digite 2");
            System.out.println("Para exibir o valor do imposto, digite 3");
            System.out.println("Para exibir os dados cadastrais, digite 4");
            System.out.println("Para sair, digite 9");
            System.out.println("");

            int numero = leitor.nextInt();
            leitor.nextLine();
            
            if (numero == 1) {
                System.out.println("Digite seu nome: ");
                nomeHabitante = leitor.nextLine();

                System.out.println("Digite sua profissão: ");
                profissao = leitor.nextLine();
            
            } else if (numero == 2) {
                System.out.println("Salários: ");
                for (int i = 0; i < salario.length; i++) 
                    System.out.println(salario[i]);

            } else if (numero == 3) {
                System.out.println("Imposto mensal: ");
                for (int i = 0; i < taxaImposto.length; i++) 
                    System.out.println(taxaImposto[i]); 
            } else if (numero == 4) {
                    System.out.println("Dados cadastrais: ");
                    System.out.println("Nome: " + nomeHabitante);
                    System.out.println("Profissão: " + profissao); 
            } else if (numero == 9) {
                    System.exit(0);
            } else {
                System.out.println("Opção inválida"); 
            }
        }
    }
}           