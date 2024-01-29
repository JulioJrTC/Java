package CodigoPuro;

import java.util.Scanner;
import java.util.Random;

public class TreinamentoJava {
    
    public static void main(String[] args){
        
        //Criando uma array numerica de 4 numeros
        int[] numeros = {5,4,3,9};
        
        //Criando um novo objeto Random
        Random numeroRandom = new Random();
        
        //Gerando um index aleatorio com base no tamanho do array
        int indexAleatorio = numeroRandom.nextInt(numeros.length);
        
        //Acessando o valor aleatorio do array
        int escolhaAleatorio = numeros[indexAleatorio];
        
        //Imprimindo o resultado
        System.out.println(escolhaAleatorio);
        
    }

}
