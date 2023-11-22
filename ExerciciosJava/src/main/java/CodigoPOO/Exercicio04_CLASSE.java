package CodigoPOO;

public class Exercicio04_CLASSE {
    
    //Atributos
    private String valor,resultado;

    //Getter & Setter    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    //Metodo    
    public void identificarValor(){
        resultado=valor;
    }    
    
}
