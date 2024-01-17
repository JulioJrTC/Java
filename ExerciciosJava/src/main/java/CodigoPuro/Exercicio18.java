package CodigoPuro;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        //Criando um novo objeto que irá ler um valor inserido pelo usuario
        Scanner lerAngulo = new Scanner(System.in);

        //Inicialmente, o valor inserido pelo usuario será armazenado em uma variavel String para tratarmos possiveis erros
        String anguloStr;

        //Iremos efetuar a conversão do valor acima para double
        double angulo;

        //Greetings!
        System.out.println("Bem vindo a calculadora de seno, cosseno e tangente (por angulos) da Prof(a) Alexa!");

        //Tratamento de erro
        while (true) {
            try {
                System.out.print("Digite um valor de angulo: ");
                anguloStr = lerAngulo.nextLine();

                //Caso o usuario digite uma virgula como ponto separador, iremos subtituir essa virgula por um ponto.
                if (anguloStr.contains(",")) {
                    anguloStr = anguloStr.replace(",", ".");
                }

                //Convertendo o angulo digitado para Double 
                angulo = Double.valueOf(anguloStr);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite um valor numerico valido (Exemplo: 6,69)");
            }

        }

        //Calculando o seno
        double seno = Math.sin(angulo);

        //Calculando o cosseno
        double cosseno = Math.cos(angulo);

        //Calculando o tangente
        double tangente = Math.tan(angulo);

        //Imprimindo o resultado
        System.out.printf("Segundo o angulo %f , o seno seria %f, cosseno %f e tangente %f.", angulo, seno, cosseno, tangente);

    }

}
