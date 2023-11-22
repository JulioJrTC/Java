package CodigoPOO;

public class Exercicio05_CLASSE {
    
    //Atributos
    private int numero;
    private int numAnt;
    private int numSuc;

    //Getters & Setters    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumAnt() {
        return numAnt;
    }

    public void setNumAnt(int numAnt) {
        this.numAnt = numAnt;
    }

    public int getNumSuc() {
        return numSuc;
    }

    public void setNumSuc(int numSuc) {
        this.numSuc = numSuc;
    }
    
    //Metodo    
    public void calcularNumero(){
        numAnt=numero-1;
        numSuc=numero+1;
    }
    
}
