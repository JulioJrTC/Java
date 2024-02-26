/* Desafio 22: Crie um programa que leia o nome completo de uma pessoa e mostre:
O nome com todas as letras maiúsculas.
O nome com todas as letras minúsculas.
Quantas letras ao todo (sem considerar espaços).
Quantas letras tem o primeiro nome. */

package CodigoPuro;

import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args){
        
        //Declarando variavel para o nome de uma pessoa
        String nomePessoa;        
        
        //Criando um novo objeto Scanner
        Scanner lerNome = new Scanner(System.in); 

        //Solicitando o nome da pessoa
        System.out.print("Digite seu nome completo: ");
        nomePessoa = lerNome.nextLine();        
        
        //Imprimindo o nome da pessoa em maiusculo
        System.out.printf("Em maiusculo, seu nome é: %s.\n",nomePessoa.toUpperCase());
        
        //Imprimindo o nome da pessoa em minusculo
        System.out.printf("Em minusculo, seu nome é: %s.\n",nomePessoa.toLowerCase());        
        
        //Imprimindo a quantidade de caracteres no primeiro nome
        String[] nomeEmPartes = nomePessoa.split(" ");        
        String primeiroNome = nomeEmPartes[0];        
        int quantC_primeiroNome = primeiroNome.length();
        System.out.printf("Seu primeiro nome contem %d caracteres\n",quantC_primeiroNome);        

        //Imprimindo a quantidade total de caracteres
        if (nomePessoa.contains(" ")){
            nomePessoa = nomePessoa.replace(" ", "");
        }        
        int quantC = nomePessoa.length();
        System.out.printf("Ao todo, seu nome contem %d caracteres.\n",quantC);
        
    }
    
}
