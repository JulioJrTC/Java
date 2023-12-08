package CodigoPuro;

import java.util.Scanner;

public class Exercicio09 { //Desafio 09: Faça um programa que leia um número inteiro qualquer e mostre na tela a sua tabuada.
    public static void main(String[] args){
        //Iremos solicitar um numero ao input
        Scanner numeroInput = new Scanner(System.in);
        
        //Chave boolean para contrar o loop WHILE abaixo
        boolean chave=true;
        
        System.out.println("Bem vindo a tabuada da Alexa!");
        //Enquanto o loop WHILE estiver ative, podemos solicitar varios numeros ao input
        while (chave){
            //Variavel irá conter o numero digitado no input, e o mesmo será substituido a cada loop
            int num=0;
            
            //Mecanica de Erro
            while (true){
                try{
                    //Armazenando numero do input a uma variavel int
                    System.out.print("Digite um numero para a tabuada: (ou digite 0 para sair) ");
                    num = Integer.parseInt(numeroInput.nextLine());
                    break;
                }catch(NumberFormatException ERRO){
                    System.out.println("ERRO! DIGITE UM VALOR VALIDO!");
                }
            }
            
            //Caso será digitado o numero 0 no input acima, o loop WHILE será encerrado
            if (num==0){
                System.out.println("Obrigado e volte sempre!");
                numeroInput.close();
                break;
            }else{
                //Condição for para a tabuada
                System.out.printf("Tabuada do %d:%n",num);
                for (int n=1;n<=10;n++){
                    int tabuada=num*n;
                System.out.printf("%d x %d = %d %n",num,n,tabuada);
                
                }
            }
        }
    }
}
