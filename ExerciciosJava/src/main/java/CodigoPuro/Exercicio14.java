package CodigoPuro;

public class Exercicio14 {
    public static void main(String[] args){        
        //Variaveis int para Temperaturas em ºC e ºF e conversões
        int tempC, tempF,convC,convF;
        
        //Variavel para temp em ºC
        tempC=28;
        
        //Variavel para temp em ºF
        tempF=105;
        
        //Convertendo temp ºC para ºF
        convF=(tempC*9/5)+32;
        
        //Convertendo temp ºF para ºC
        convC=(tempF*5/9)-32;
        
        //Imprimindo resultado da conversão de Cº para Fº
        System.out.printf("%dºC convetido para ºF é igual a %dºF.%n",tempC,convF);
        
        //Imprimindo resultado da conversão de Fº para Cº
        System.out.printf("%dºF convertido para ºC é igual a %dºC.%n",tempF,convC);
    }    
}
