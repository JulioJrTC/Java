package CodigoPuro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        //Criando um novo objeto que irá ler numeros inseridos pelo input
        Scanner lerNumero = new Scanner(System.in);

        //Variaveis que irão receber valores do Catete Adjancente e Oposto e por fim sua hipotenusa
        int cateteAdjacente;
        int cateteOposto;
        double hipotenusa;

        //Greeting!
        System.out.println("Triangulo Retangulo e sua Hipotenusa!");

        //Tratamento de erro
        while (true) {
            try {
                //Perguntando ao input um valor de cateto adjacente
                System.out.print("Digite um valor para o cateto adjacente: ");
                cateteAdjacente = lerNumero.nextInt();
                break;
            } catch (InputMismatchException e) {
                //Qualquer valor alem de numerico será retornado com um erro
                System.out.println("Erro! Digite somente valores numericos!");
                lerNumero.nextLine();
            }
        }

        //Tratamento de erro
        while (true) {
            try {
                //Perguntando ao input um valor de cateto oposto
                System.out.print("Digite um valor para o cateto oposto: ");
                cateteOposto = lerNumero.nextInt();
                break;
            } catch (InputMismatchException e) {
                //Qualquer valor alem de numerico será retornado com um erro
                System.out.println("Erro! Digite somente valores numericos!");
                lerNumero.nextLine();
            }
        }

        //Usando da biblioteca Math para calcularmos a hipotenusa e imprimirmos seu resultado
        hipotenusa = Math.hypot(cateteAdjacente, cateteOposto);
        System.out.printf("Em um triangulo retangulo com %d x %d sua hipotenusa é igual a %.2f.", cateteAdjacente, cateteOposto, hipotenusa);

    }

}
