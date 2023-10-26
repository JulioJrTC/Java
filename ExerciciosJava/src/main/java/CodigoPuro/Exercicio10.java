package CodigoPuro;

public class Exercicio10 {
    public static void main(String[] args){
        
        //Variaveis float para o dolar, carteira e a conversão para dolar
        double dolar,carteira,conversaoDolar;
        
        //Cotação do dolar atual
        dolar=5.01;//BRL
        
        //Carteira do input
        carteira=10; //Reais
        
        //Convertendo real para dolar
        conversaoDolar=(carteira/dolar);
        
        //Imprimindo resultado
        System.out.println("Com R$"+carteira+" vc consegue comprar $"+conversaoDolar+" em dolar.");        
        
    }
}
