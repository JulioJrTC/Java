package CodigoPOO;

public class Exercicio06_CLASSE {
    
    //Atributos
    private double numero;
    private double dobro;
    private double triplo;
    private double raizQuadrada;
    
    //Getters & Setters
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getDobro() {
        return dobro;
    }

    public void setDobro(double dobro) {
        this.dobro = dobro;
    }

    public double getTriplo() {
        return triplo;
    }

    public void setTriplo(double triplo) {
        this.triplo = triplo;
    }

    public double getRaizQuadrada() {
        return raizQuadrada;
    }

    public void setRaizQuadrada(double raizQuadrada) {
        this.raizQuadrada = raizQuadrada;
    }
    
    //Metodo    
    public void calcularNumeros(){
        dobro=numero*2;
        triplo=numero*3;
        raizQuadrada=Math.sqrt(numero);
    }
    
}
