package CodigoPuro;

import java.util.Scanner;

public class Exercicio06 {
    //Desafio 06: Crie um algoritmo que leia um numero e mostre o seu dobro, triplo e raiz quadrada.
    
    public static void main(String[] args){
        
        //Criando um novo objeto para o Scanner
        Scanner pedirNumero = new Scanner(System.in);
        
        //Pedindo um numero ao input e armazenando este numero em uma variavel
        System.out.print("Digite um numero: ");
        double numero=pedirNumero.nextDouble();
        
        //Criando variaveis para o dobro, triplo e raiz quadrada
        double dobro=numero*2;
        double triplo=numero*3;
        double raizQuadrada=Math.sqrt(numero);
        
        //Imprimindo resultados finais
        System.out.printf("O dobro do numero %.0f é igual a %.0f, triplo %.0f e raiz quadrada %.2f.", numero,dobro,triplo,raizQuadrada);
        
    }
}
