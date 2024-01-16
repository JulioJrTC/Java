package CodigoPOO;

public class Exercicio17_CLASSE {
    
    //Atributos
    private int ca;
    private int co;
    private int resultadoCa;
    private int resultadoCo;
    private int somaCaCo;
    private double hipo;
    
    //Getters e Setters    
    //Getter
    public int getCa(){
        return ca;
    }
    
    //Setter
    public void setCa(int ca){
        this.ca = ca;
    }
    
    //Getter
    public int getCo(){
        return co;
    }
    
    //Setter
    public void setCo(int co){
        this.co = co;
    }
    
    //Getter
    public int getResultadoCa(){
        return resultadoCa;
    }
    
    //Setter
    public void setResultadoCa(int resultadoCa){
        this.resultadoCa = resultadoCa;
    }
    
    //Getter
    public int getResultadoCo(){
        return resultadoCo;
    }
    
    //Setter
    public void setResultadoCo(int resultadoCo){
        this.resultadoCo = resultadoCo;
    }

    //Getter
    public int getSomaCaCo(){
        return somaCaCo;
    }
    
    //Setter
    public void setSomaCaco(int somaCaco){
        this.somaCaCo = somaCaco;
    }
    
    //Getter
    public double getHipo(){
        return hipo;
    }
    
    //Setter
    public void setHipo(double hipo){
        this.hipo = hipo;
    }
    
    //Metodo Construtor
    public Exercicio17_CLASSE(int ca, int co, int resca, int resco, int somacaco, double raizq){
        this.ca = ca;
        this.co = co;
        this.resultadoCa = resca;
        this.resultadoCo = resco;
        this.somaCaCo= somacaco;
        this.hipo=raizq;
    }
    
    //Metodos
    public void caQuadrado(){
        setResultadoCa((int)Math.pow(getCa(), 2));    
    }
    
    public void coQuadrado(){
        setResultadoCo((int)Math.pow(getCo(),2));
    }
    
    public void somarCaCo(){
        setSomaCaco(getResultadoCa()+getResultadoCo());        
    }
    
    public void hipotenusa(){
        setHipo(Math.sqrt(getSomaCaCo()));
    }
    
}
