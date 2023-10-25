package CodigoPuro;

public class Exercicio06 {
    
    public static void main(String[] args){
        int numero,dobro,triplo;
        double numeroFloat,raizQuadrada;        
        
        //Variavel int numero
        numero=10;
        
        //A variavel int abaixo irá receber o dobro do numero acima
        dobro=numero*2;
        
        //A variavel int abaixo irá receber o triplo do numero acima
        triplo=numero*3;
        
        //Convertendo numero int para a variavel double abaixo
        numeroFloat=numero;

        //A variavel double abaixo irá receber a raiz quadrada do numero float acima
        raizQuadrada= Math.sqrt(numeroFloat);

        //Imprimindo valores
        System.out.println("Numero: "+numero);
        System.out.println("Dobro: "+dobro);
        System.out.println("Triplo: "+triplo);
        System.out.println("Raiz Quadrada: "+raizQuadrada);
        
    }
}
