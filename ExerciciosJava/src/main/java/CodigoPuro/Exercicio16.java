package CodigoPuro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        //Criando um objeto Scanner que irá solicitar um valor numero ao usuario
        Scanner lerNumero = new Scanner(System.in);

        //Iremos primeiro solicitar um valor numero que iremos armazenar em uma variavel string
        String numeroString;
        
        //Logo apos, iremos converter esse valor string para double
        double numeroDouble;
        
        //E por fim, iremos converter esse valor double para integer
        int numeroInt;

        //Tratamento de erro
        while (true) {
            try {
                //Solicitando um valor numero ao usuario
                System.out.print("Digite um numero: ");
                numeroString = lerNumero.nextLine();

                //Se o usuario digitar uma virgula (em vez de ponto) iremos substituir essa virgular por um ponto
                if (numeroString.contains(",")) {
                    numeroString = numeroString.replace(",", ".");
                }

                //Convertendo o valor digitando anteriormente em uma variavel double
                numeroDouble = Double.valueOf(numeroString);

                break;

            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite somente numeros!");
                lerNumero.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite somente numeros!");
                lerNumero.nextLine();
            }

        }

        //Convetendo um valor double para int
        numeroInt = (int) Math.floor(numeroDouble);

        //Imprimindo o resultado
        System.out.printf("O numero %.3f tem a parte inteira %d.", numeroDouble, numeroInt);

    }

}
