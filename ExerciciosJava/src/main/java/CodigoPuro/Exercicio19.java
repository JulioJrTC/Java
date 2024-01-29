package CodigoPuro;

import java.util.Scanner;
import java.util.Random;

public class Exercicio19 {

    //Cores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String PINK = "\u001B[35m";    
    
    public static void main(String[] args) throws InterruptedException {        
        
        //Objeto Scanner
        Scanner lerNomes = new Scanner(System.in);
        
        //Objeto Random
        Random escolhaRandom = new Random();

        //Lista String para 4 alunas
        String[] alunos = {"Alexa","Dakota","Candice","Tegan Nox"};
        
        //Imprimindo o nomes das alunas
        System.out.println("Alunas na classe:");
        for (int i = 0; i<alunos.length;i++){
            System.out.println(alunos[i]);
        }
        
        //Gerando um index aleatorio
        int indexRandom = escolhaRandom.nextInt(alunos.length);
        
        //Imprimindo a aluna escolhida!
        System.out.println("\nSorteando uma aluna...");
        Thread.sleep(5000); //Efeito cosmetico de loading
        System.out.println("E a escolhida foi...\n ");
        Thread.sleep(2000); //Efeito cosmetico de loading
	System.out.printf("%s%s!%s",PINK,alunos[indexRandom],RESET);
        
    }

}
