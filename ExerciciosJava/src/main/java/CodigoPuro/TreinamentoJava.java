package CodigoPuro;

public class TreinamentoJava {
    //Variavel declarada fora dos metodos abaixo
    String garota; // Escopo de classe

    //Metodo principal
    public static void main(String[] args) {
        TreinamentoJava obj = new TreinamentoJava();
        obj.garota = "Alexa";
        obj.imprimirNome();
        // Variável garota é acessível aqui        
    }
    
    //Metodo que irá imprimir uma variavel
    public void imprimirNome(){
        System.out.println(this.garota);
        // Variável garota ainda é acessível aqui
    }

}
