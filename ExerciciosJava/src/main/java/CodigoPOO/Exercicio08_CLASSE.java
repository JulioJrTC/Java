package CodigoPOO;

public class Exercicio08_CLASSE {
    
    //Atributos
    private double numeroMetro, numeroCm, numeroMm;

    //Getters e Setters
    public double getNumeroMetro() {
        return numeroMetro;
    }

    public void setNumeroMetro(double numeroMetro) {
        this.numeroMetro = numeroMetro;
    }

    public double getNumeroCm() {
        return numeroCm;
    }

    public void setNumeroCm(double numeroCm) {
        this.numeroCm = numeroCm;
    }

    public double getNumeroMm() {
        return numeroMm;
    }

    public void setNumeroMm(double numeroMm) {
        this.numeroMm = numeroMm;
    }
    
    //Metodo
    public void converterMetros(){
        numeroCm=numeroMetro*100;
        numeroMm=numeroMetro*1000;
    }
    
}
