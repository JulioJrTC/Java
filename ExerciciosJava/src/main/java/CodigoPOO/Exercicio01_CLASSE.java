package CodigoPOO;

public class Exercicio01_CLASSE {
    
    //Criando uma variavel de instancia/atributo string
    private String texto;
    
    //Encapsulamento
    //Getter (podemos usar do Getter para chamarmos da variavel (privada) acima)
    public String getTexto() {
        return texto;
    }
    //Setter (Podemos substituir por exemplo o texto da variavel acima)
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    //Criando um metodo que irá imprimir o valor armazenado na variavel texto acima
    public void imprimirTexto(){        
        texto="Hello World!";        
    }
}
