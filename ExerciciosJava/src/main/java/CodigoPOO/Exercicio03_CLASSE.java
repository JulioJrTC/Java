package CodigoPOO;

public class Exercicio03_CLASSE {
    
    //Atributos
    private int v1,v2,resultado;
    
    //Getters & Setters
    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getResultado() {
        return resultado;
    }

    //public void setResultado(int resultado) {
    //    this.resultado = resultado;
    //}
    
    //Metodo
    public void calcularSoma(){
        resultado=v1+v2;
    }
    
}
