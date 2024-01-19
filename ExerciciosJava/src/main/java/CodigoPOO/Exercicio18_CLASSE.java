package CodigoPOO;

public class Exercicio18_CLASSE {
    
    //Atributos
    private double angulo;
    private String anguloStr;
    private double seno;
    private double cosseno;
    private double tangente;
    
    //Getters e Setters    
    //Getter atributo angulo
    public double getAngulo(){
        return angulo;
    }
    //Setter atributo angulo
    public void setAngulo(double angulo){
        this.angulo = angulo;
    }
    
    //Getter atributo angulo string
    public String getAnguloStr(){
        return anguloStr;
    }
    //Setter atributo angulo string
    public void setAnguloStr(String anguloStr){
        this.anguloStr = anguloStr;
    }

    //Getter atributo seno
    public double getSeno(){
        return seno;
    }    
    //Setter atributo seno
    public void setSeno(double seno){
        this.seno = seno;
    }
    
    //Getter atributo cosseno
    public double getCosseno(){
        return cosseno;
    }
    //Setter atributo cosseno
    public void setCosseno(double cosseno){
        this.cosseno = cosseno;
    }
    
    //Getter atributo tangente
    public double getTangente(){
        return tangente;
    }
    //Setter atributo tangente
    public void setTangente(double tangente){
        this.tangente = tangente;
    }
    
    //Metodo
    public Exercicio18_CLASSE(double angulo, String anguloStr, double seno, double cosseno, double tangente){
        this.angulo = angulo;
        this.anguloStr = anguloStr;
        this.seno = seno;
        this.cosseno = cosseno;
        this.tangente = tangente;
    }    
    public void calcularSeno(){
        setSeno(Math.sin(getAngulo()));
    }
    public void calcularCosseno(){
        setCosseno(Math.cos(getAngulo()));
    }
    public void calcularTangente(){
        setTangente(Math.tan(getAngulo()));
    }
    public void corrigirVirgula(){
        if (getAnguloStr().contains(",")){
            setAnguloStr(getAnguloStr().replace(",", "."));
            setAngulo(Double.parseDouble(getAnguloStr()));
        }
    }
    
}
