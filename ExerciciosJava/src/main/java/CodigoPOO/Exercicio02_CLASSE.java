package CodigoPOO;

import javax.swing.JTextField;

public class Exercicio02_CLASSE {
    //Atributos
    String nomePessoa,frase;

    //Getters e Setters
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    //Metodo
    public void mensagemPessoal(){
        frase="Olá "+nomePessoa+", é um prazer ter vc aqui!";       
    
    }
}
