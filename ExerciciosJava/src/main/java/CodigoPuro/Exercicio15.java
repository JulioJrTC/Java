package CodigoPuro;

public class Exercicio15 {
    public static void main(String[] args){
        int dias;
        double km,valorDias,valorKm;
        
        //Quantidade de KMs percorridos
        km=5;
        valorKm=(km*0.15);        
        
        //Quantidade de dias alugados
        dias=2;
        valorDias=(dias*60);
        
        //Imprimindo o valor final
        System.out.printf("Vc percorreu %.0f KMs durante os %d dias alugados, valor a pagar: R$ %.2f.",km,dias,(valorDias+valorKm));
        
    }    
}
