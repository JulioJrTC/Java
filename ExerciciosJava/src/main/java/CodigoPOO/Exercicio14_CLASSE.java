package CodigoPOO;

public class Exercicio14_CLASSE {
    
    //Atributos
    double temp, convF, convC;
    
    //Getters e Setters
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getConvF() {
        return convF;
    }

    public double getConvC() {
        return convC;
    }
    
    //Metodos    
    //Metodo que irá converter ºC para ºF
    public void converterF(){
        convF = (temp*9/5)+32;
    }
    //Metodo que irá converter ºF para ºC
    public void converterC(){
        convC = (temp-32)*5/9;
    }
    
}
