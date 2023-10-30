package CodigoPuro;

public class Exercicio11 {    
    public static void main(String[] args){
        
        //Definindo duas variaveis integer para a largura e altura, area da parede
        int largura,altura,area,quantTinta;
        
        //Definindo largura da parede
        largura=10;
        
        //Definindo altura da parede
        altura=15;
        
        //Definindo a area que será a multiplicação da largura e altura da parede
        area=(largura*altura);
        
        //Definindo a quantidade necessaria de tinta que será necessaria para pintar
        quantTinta=area/2;        
        
        //Imprimindo os valores de largura, altura e area
        System.out.printf("Sua parede tem a dimensão de %dx%d e sua area de %d. %n",largura,altura,area);
      
        //Imprimindo a quantidade necessaria de tinta
        System.out.printf("Para pintar essa parede vc irá precisar de %d litros de tinta. %n",quantTinta);        
    }
}
