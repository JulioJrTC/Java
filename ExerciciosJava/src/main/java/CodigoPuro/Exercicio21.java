//Desafio 21: Faça um programa em Python que abra e reproduza o áudio de um arquivo MP3.

package CodigoPuro;

//Essa biblioteca será usada para reproduzir o arquivo MP3
import javazoom.jl.player.Player;

//Esta biblioteca será usava para ler o arquivo MP3
import java.io.FileInputStream;

public class Exercicio21 {
    
    public static void main(String[] args){
        
        //Tratamento de erro, caso seja possivel reproduzir o arquivo, iremos executar o codigo abaixo
        try{
            //Criando um objeto FileInputStream que irá ler um arquivo
            FileInputStream fileInputStream = new FileInputStream("C:/Users/julio/OneDrive/Música/Almanaque.MP3");
            
            //Criando um objeto Player que irá reproduzir o arquivo lido pelo objeto criado acima
            Player player = new Player(fileInputStream);
            
            //Indicando que o conteudo está sendo reproduzindo
            System.out.println("Reproduzindo...");
            
            //Reproduzindo o arquivo MP3
            player.play();
            
            //Indicando que o arquivo terminou sua reprodução
            System.out.println("Musica terminou.");
          
        }        
        //Caso contrario, iremos exibir uma mensagem de erro
        catch(Exception e ){
            System.out.println("Erro ao reproduzir o arquivo, erro: "+e);
        }        
        
    }
    
}
