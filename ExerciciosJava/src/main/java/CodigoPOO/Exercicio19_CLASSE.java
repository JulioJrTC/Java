package CodigoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio19_CLASSE {
    
    //Atributos
    private String a1,a2,a3,a4,alunoEscolhido;
    
    //Getters e Setters    
    //Getter
    public String getA1(){
        return a1;
    }
    //Setter
    public void setA1(String a1){
        this.a1 = a1;
    }
    
    //Getter
    public String getA2(){
        return a2;
    }
    //Setter
    public void setA2(String a2){
        this.a2 = a2;
    }
    
    //Getter
    public String getA3(){
        return a3;
    }
    //Setter
    public void setA3(String a3){
        this.a3 = a3;
    }
    
    //Getter
    public String getA4(){
        return a4;
    }
    //Setter
    public void setA4(String a4){
        this.a4 = a4;
    }
    
    //Getter
    public String getAlunoEscolhido(){
        return alunoEscolhido;
    }
    //Setter
    public void setAlunoEscolhido(String alunoEscolhido){
        this.alunoEscolhido = alunoEscolhido;
    }
    

    //Metodos    
    //Metodo construtor
    public Exercicio19_CLASSE(String a1, String a2, String a3, String a4){
        this.a1 = "Aluno 1";
        this.a2 = "Aluno 2";
        this.a3 = "Aluno 3";
        this.a4 = "Aluno 4";
    }    
    
    //Metodo que irá escolher um aluno aleatorio de uma lista
    public void escolherAluno(){
        
        //Criando uma nova lista de Strings
        List<String> listaAlunos = new ArrayList<>();
        
        //Adicionado elementos a lista criada
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        
        //Armazendo a quantidade numerica de elementos na lista
        int listaIndex = listaAlunos.size();
        
        //Criando um novo objeto random
        Random random = new Random();
        
        //Escolhendo aleatoriamente um valor numerico baseado na quantidade de elementos na lista
        int indexAleatorio = random.nextInt(listaIndex);
        
        //Retornando o nome do aluno baseado no valor aleatorio escolhido acima
        setAlunoEscolhido(listaAlunos.get(indexAleatorio));
    }
    
}
