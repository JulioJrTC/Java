package CodigoPuro;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        //Criando novo objeto Scanner
        Scanner lerNumero = new Scanner(System.in);

        //Variaveis para o salario atual, aumento e novo salario (com desconto)
        double salarioAtual, novoSalario;
        int aumento;

        //Traramento de erro
        String erro1 = "Erro! Digite o salario atual do funcionario!";
        String erro2 = "Erro! Digite em quantos por cento iremos aumentar o salario!";

        //Perguntando ao usuario o salario atual do mesmo
        while (true) {
            try {
                System.out.print("Digite seu salario atual: R$");
                salarioAtual = Double.parseDouble(lerNumero.nextLine());
                break;

            } catch (NumberFormatException ERRO) {
                System.out.println(erro1);
            }
        }

        //Percentual de aumento ao salario
        while (true) {
            try {                
                System.out.print("Em quantos % será o aumento: ");
                aumento = Integer.parseInt(lerNumero.nextLine());
                break;

            } catch (NumberFormatException ERRO) {
                System.out.println(erro2);
            }
        }

        //Calculando e imprimindo novo salario
        String percent = "%";
        novoSalario = salarioAtual + (salarioAtual * aumento / 100);
        System.out.printf("O salario que antes era R$%.2f sofreu um aumento de %d%s e partir de agora será R$%.2f!", salarioAtual, aumento, percent, novoSalario);

    }

}
