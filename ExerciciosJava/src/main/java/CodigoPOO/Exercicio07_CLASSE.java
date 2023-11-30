package CodigoPOO;

public class Exercicio07_CLASSE {
    
    //Atributos
    private double num1,num2,media;
    
    //Getters & Setters

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    //Metodo
    public void calcularMedia(){
        media=(num1+num2)/2;
    }
    
}
