package CodigoPOO;

public class Exercicio16_CLASSE {
    
    //Atributos
    private String numeroString;
    private double numeroDouble;
    private int numeroInt;
    
    //Getters e Setters
    
    //Getter
    public String getnumeroString(){
        return numeroString;
    }
    //Setter
    public void setnumeroString(String numeroString){
        this.numeroString = numeroString;
    }
    
    //Getter
    public double getnumeroDouble(){
        return numeroDouble;
    }
    //Setter
    public void setnumeroDouble(double numeroDouble){
        this.numeroDouble = numeroDouble;
    }
    
    //Getter
    public int getnumeroInt(){
        return numeroInt;
    }
    //Setter
    public void setnumeroInt(int numeroInt){
        this.numeroInt = numeroInt;
    }
    
    //Metodos
    
    //Metodo construtor
    public Exercicio16_CLASSE(String s, double d, int i){
        this.numeroString=s;
        this.numeroDouble=d;
        this.numeroInt=i;
    }

    //Metodo para um tratamento de erro
    public void substituirVirgula(){
        if(getnumeroString().contains(",")){
            setnumeroString(getnumeroString().replace(",", "."));
        }
    }
    
    //Metodo que irá converter um valor string para double
    public void converterDouble(){
        setnumeroDouble(Double.valueOf(getnumeroString()));        
    }
    
    //Metodo que irá converter um valor double para integer
    public void converterInt(){
        setnumeroInt((int)Math.floor(getnumeroDouble()));
    }
    
}
