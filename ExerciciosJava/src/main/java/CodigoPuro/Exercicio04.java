package CodigoPuro;

public class Exercicio04 {
    
    public static void main(String[] args){
        //Definindo uma variavel string para um texto
        String texto;       
        
        //A variavel texto irá receber o texto abaixo
        texto="Alexa Farted!"; //A variavel string irá receber um texto
        
        //Definindo uma variavel do tipo class para verificarmos o tipo primitivo da variavel acima
        Class tipoClass=texto.getClass();
        
        //Imprimindo o texto e o tipo primitivo
        System.out.printf("Valor: "+texto+"\nTipo de valor: "+tipoClass);
    }
}
