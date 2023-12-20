package CodigoPOO;

public class Exercicio13_CLASSE {

    //Atributos    
    double salarioAtual;
    double novoSalario;
    int percentual;

    //Getters e Setters
    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }

    //Metodos
    public void aumentarSalario() {
        novoSalario = salarioAtual + (salarioAtual * percentual / 100);
    }

    public void reduzirSalario() {
        novoSalario = salarioAtual - (salarioAtual * percentual / 100);
    }

}
