package CodigoPOO;

public class Exercicio10_CLASSE {
    
    //Atributos
    private float carteira;
    private float conversaoDolar;
    private float conversaoReais;
    private float cotacaoAtual;
    
    //Getters e Setters
    public float getCarteira() {
        return carteira;
    }

    public void setCarteira(float carteira) {
        this.carteira = carteira;
    }

    public float getConversaoDolar() {
        return conversaoDolar;
    }

    public void setConversaoDolar(float conversaoDolar) {
        this.conversaoDolar = conversaoDolar;
    }

    public float getConversaoReais() {
        return conversaoReais;
    }

    public void setConversaoReais(float conversaoReais) {
        this.conversaoReais = conversaoReais;
    }

    public float getCotacaoAtual() {
        return cotacaoAtual;
    }

    public void setCotacaoAtual(float cotacaoAtual) {
        this.cotacaoAtual = cotacaoAtual;
    }
    
    //Metodo para a conversão de moedas
    public void converterMoeda(){
        conversaoReais=(carteira/cotacaoAtual);
        conversaoDolar=(carteira*cotacaoAtual);
        
    }
    
}
