package CodigoPuro;

import java.util.Scanner;

public class Exercicio08 { //Desafio 08: Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
    public static void main(String[] args){
        //Criando objeto Scanner para o input
        Scanner numeroInput = new Scanner(System.in);        
        
        //Definindo variavel vazia para Metros
        double metros=0;        
        
        //Mecanica de Erro
        while (true){
            try{
                //Metros (solicitando numero ao usuario)
                System.out.print("Digite um valor em metros: ");        
                metros=Double.parseDouble(numeroInput.nextLine());
                break;
            }catch(NumberFormatException ERRO){
                System.out.println("ERRO!");
            }
        }        
        
        //Convertendo Metros para Centimentros
        double centimetro=metros*100;
        
        //Convertendo Metros para Milimetros
        double milimetros=metros*1000;
        
        //Imprimindo valores convertidos
        System.out.printf("%.1f(m) é igual a %.1f(cm) e %.1f(mm).",metros,centimetro,milimetros);
        
        //Fechando o Scanner (para evitar vazamentos de recursos)
        numeroInput.close();
        
    }
    
}
