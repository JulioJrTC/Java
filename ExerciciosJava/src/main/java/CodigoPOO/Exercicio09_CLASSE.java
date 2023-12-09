package CodigoPOO;

public class Exercicio09_CLASSE {
    
    //Atributos para o numero principal, contador do loop e resposta da tabuada
    private int num;
    private int n;
    private int res;

    //Getters e Setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    //Metodo que irá receber o calculo da tabuada e retornar as respostas
    public int tabuada(){
        res=num*n;
        return res;
    }
    
}
