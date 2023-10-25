package CodigoPuro;

public class TreinamentoJava{
    public static void main(String[] args){
        
        //Lista integer que irá conter 3 numeros
        int[] numerosLista=new int[3];
        
        //Variavel em que iremos somar os numeros inseridos na lista
        int soma;
        
        //Cada index da lista irá receber um numero
        numerosLista[0]=5;
        numerosLista[1]=5;
        numerosLista[2]=10;        
        
        //Somando os valores na lista
        soma=numerosLista[0]+numerosLista[1]+numerosLista[2];        
        
        //Imprimindo a variavel de soma
        System.out.print(soma);

    }
}


