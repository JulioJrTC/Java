package CodigoPuro;

public class Exercicio09 {
    public static void main (String[] args){
        //Definindo variaveis int para o numero da tabuada, chave e resultado
        int tabuada,chave,resultado;
        
        //Tabuada de um numero
        tabuada=2;
        
        //Chave de controle para o loop (de qual numero iremos começar a calcular no loop)
        chave=1;
        
        System.out.println("Tabuada do "+tabuada+":");        
        //Abrindo um loop de 1 a 10, calculando a tabuada
        while(chave<=10){
            resultado=tabuada*chave;
            System.out.println(tabuada+"*"+chave+"="+resultado);
            chave++;
        }
    }
}
