package CodigoPOO;

public class Exercicio09_CLASSE {
    
    private int num;
    private int n;
    private int res;

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
    
    public int tabuada(){
        res=num*n;
        return res;
    }
    
}
