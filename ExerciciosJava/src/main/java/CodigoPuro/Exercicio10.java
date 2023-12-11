package CodigoPuro;

import java.util.Scanner;

public class Exercicio10 { //Desafio 10: Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
    
    public static void main(String[] args){
        
        Scanner lerCarteira = new Scanner(System.in);
        
        //Solicitando ao input a quantidade em R$ para convertermos para USD
        System.out.print("Digite quanto dinheiro vc tem: R$");
        float carteira = lerCarteira.nextFloat();
        
        //Dolar atual: 1$ = R$4.93
        float dolarAtual = 4.93f;
        
        //Convertendo R$ para USD
        float conversaoDolar=(carteira/dolarAtual);        
        
        //Imprimindo resultado
        System.out.printf("Com R$%.2f vc irá conseguir comprar %.2f$ em dolares.",carteira,conversaoDolar);
        
        //Fechando o Scanner
        lerCarteira.close();
        
    }
    
}
