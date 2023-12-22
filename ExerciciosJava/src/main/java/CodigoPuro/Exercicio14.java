package CodigoPuro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {

    //Desafio 14: Escreva um programa que converta uma temperatura digita em ºC e converta para ºF.
    public static void main(String[] args) {

        //Criando objeto Scanner para lermos o input do usuario
        Scanner lerNumero = new Scanner(System.in);

        try {
            //Sistema de escolha, iremos deixar o usuario escolher como seria a conversão
            System.out.printf("Como deseja efetuar a conversão: %n[1] Converter para ºF %n[2] Converter para ºC %n[3] Sair do programa %n");
            int escolha = lerNumero.nextInt();

            switch (escolha) {
                case 1:
                    //Solicitando temp em °C para o usuario
                    System.out.print("Digite a temperatura em °C: ");
                    double tempC = lerNumero.nextDouble();

                    //Formula matematica para a conversão para °F
                    double conversaoF = (tempC * 9 / 5) + 32;

                    //Imprimindo resultado da conversão
                    System.out.printf("%.1f°C é igual a %.1f°F.", tempC, conversaoF);
                    break;

                case 2:
                    //Solicitando temp em ºF para o usuario
                    System.out.print("Digite a temperatura em ºF: ");
                    double tempF = lerNumero.nextDouble();

                    //Formula matematica para a conversão para ºC
                    double conversaoC = (tempF - 32) * 5 / 9;

                    //Imprimindo resultado da conversão
                    System.out.printf("%.1f°F é igual a %.1f°C.", tempF, conversaoC);
                    break;

                case 3:
                    System.out.println("Obrigado e volte sempre!");
                    break;

                default:
                    System.out.print("Escolha invalida, por favor tente novamente!");
            }

        } catch (InputMismatchException erro) {
            System.out.println("Erro! Por favor digite somente numeros!");
        } finally {
            lerNumero.close();
        }

    }

}
