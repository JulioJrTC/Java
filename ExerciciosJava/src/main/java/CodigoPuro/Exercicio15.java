package CodigoPuro;

import java.util.Scanner;

public class Exercicio15 {

    /* Desafio 15: Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado 
	e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, 
	sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado. */
    
    public static void main(String[] args) {

        //Novo objeto Scanner que irá ler do input os valores necessarios para o programa
        Scanner lerValor = new Scanner(System.in);

        //Perguntando ao input a quantidade de km percorridos
        System.out.print("Digite a quantide de KMs percorridos: ");
        int kmPercorridos = lerValor.nextInt();
        //Calculando o valor a pagar por Km percorrido (R$0.15 por KM)
        double valorKm = (kmPercorridos * 0.15);

        //Perguntando ao input a quantidade de dias alugados
        System.out.print("Digite a quantidade de dias alugados: ");
        int diasAlugados = lerValor.nextInt();
        //Calculando o valor a pagar por Dias alugados (R$60 por dia alugado)
        double valorDias = (diasAlugados * 60);

        //Calculando o valor final a pagar
        double totalaPagar = (valorDias + valorKm);

        //Imprimindo os resultados finais
        System.out.println("Resumo:");
        
        System.out.printf("Dias alugados: %d\n", diasAlugados);
        System.out.printf("Valor de aluguel a pagar: %.2f\n", valorDias);

        System.out.printf("KMs percorridos: %d\n", kmPercorridos);
        System.out.printf("Valor de KMs a pagar: %.2f\n", valorKm);

        System.out.printf("Total: %.2f", totalaPagar);

    }

}
