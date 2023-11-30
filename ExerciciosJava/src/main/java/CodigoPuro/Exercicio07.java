package CodigoPuro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 { //Desafio 07: Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.    
    
    public static void main(String[] args){
        //Novo objeto scanner (input)
        Scanner inputNumero = new Scanner(System.in);        
        
        //Pedindo numeros ao usuario
        System.out.print("Digite um numero: ");
        double num1=inputNumero.nextDouble();
        System.out.print("Digite outro numero: ");
        double num2=inputNumero.nextDouble();
        
        //Imprimindo media de numeros
        double media=(num1+num2)/2;
        System.out.printf("A media dos numeros %.2f e %.2f é igual a %.2f",num1,num2,media);
        
    }
    
}
