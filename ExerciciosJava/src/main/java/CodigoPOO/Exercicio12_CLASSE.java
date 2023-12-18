package CodigoPOO;

public class Exercicio12_CLASSE {

    //Atributos
    double valorOriginal, novoValor;
    int desconto;

    //Getters e Setters
    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getNovoValor() {
        return novoValor;
    }

    public void setNovoValor(double novoValor) {
        this.novoValor = novoValor;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    

    //Metodo
    public void calcularPreco() {
        novoValor = valorOriginal - (valorOriginal * desconto / 100);

    }

}
