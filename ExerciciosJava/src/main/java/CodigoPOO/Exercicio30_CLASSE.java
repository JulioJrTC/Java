package CodigoPOO;

public class Exercicio30_CLASSE {
    
    //Atributo
    private int numero;
    
    //Getter e Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Metodo (com retorno)   
    public String IdentificarNumero(){
        String mensagem;
        if(this.numero%2==0){                        
            mensagem="O numero é PAR!";
        }
        else{
            mensagem="O numero é IMPAR!";
        }        
        return mensagem;
    }
}
