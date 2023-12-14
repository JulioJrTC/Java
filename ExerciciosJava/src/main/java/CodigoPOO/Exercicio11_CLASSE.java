package CodigoPOO;

public class Exercicio11_CLASSE {
    
    //Atributos
    private double altura,largura,area,quantTinta;
    
    //Getters e Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getQuantTinta() {
        return quantTinta;
    }

    public void setQuantTinta(double quantTinta) {
        this.quantTinta = quantTinta;
    }
    
    //Metodos
    public void calcularArea(){
        area = (altura*largura);       
        
    }
    public void calcularTinta(){        
        quantTinta = (area/2);        
    }
    
    
}
