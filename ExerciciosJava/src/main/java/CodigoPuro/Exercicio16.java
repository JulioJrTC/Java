package CodigoPuro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        //Criando um novo objeto Scanner que irá perguntar ao input um numero double
        Scanner lerReal = new Scanner(System.in);

        //Iremos armazenar o numero digitado na variavel abaixo
        double numeroReal;

        //Tratamento de erro
        while (true) {
            try {
                System.out.print("Digite um numero real (Usando virgula como ponto separador): ");
                numeroReal = lerReal.nextDouble();
                break;

            } catch(InputMismatchException e){
                System.out.println("Erro! Digite somente numeros!");
                lerReal.nextLine(); //Precisamos chamar o Scanner novamente, caso contrario serã loop infinito               
            }
        }

        //Iremos usar do Math.floor para "arredondarmos" o numero digitado e iremos imprimir o resultado
        double numeroInteiro = Math.floor(numeroReal);
        System.out.printf("O numero %.3f tem a parte inteira %.0f.", numeroReal, numeroInteiro);

    }

}
