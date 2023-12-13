/* Desafio 11: Faça um programa que leia a largura e a altura de uma parede em metros, 
calcule a sua área e a quantidade de tinta necessaria para pinta-la, sabendo que cada litro de tinta, pinta uma area de 2m². */

package CodigoPuro;

import java.util.Scanner;

public class Exercicio11 { 
    public static void main(String[] args){
        
        //Variaveis para altura e largura
        double altura,largura;

        //Novo objeto Scanner para o input do usuario
        Scanner inputNumeros = new Scanner(System.in);

        //Mecanica de erro
        while(true){
            try{
                //Solicitando altura ao usuario
                System.out.print("Digite a altura (em metros): ");
                altura = Double.parseDouble(inputNumeros.nextLine());
                break;
                
            }catch(NumberFormatException ERRO){
                System.out.println("ERRO! Digite somente numeros para a altura (Com ponto como separador)!");
            }
        }
        
        //Mecanica de erro
        while(true){
            try{
                //Solicitando largura ao usuario
                System.out.print("Digite a largura (em metros): ");
                largura = Double.parseDouble(inputNumeros.nextLine());
                break;
                
            }catch(NumberFormatException ERRO){
                System.out.println("ERRO! Digite somente numeros para a largura (Com ponto como separador)!");                
            }
        }        
        
        //Calculando area
        double area = (altura*largura);
        System.out.printf("Com %.2f(m) de altura e %.2f(m) de largura, teremos uma area de %.2f(m²).",altura,largura,area);
        
        //Calculado quantidade de tinta
        double quantTinta = (area/2);
        System.out.printf("%nSerá necessario %.2f(l) de tinta para pintarmos esta area.",quantTinta);
        
    }
}
