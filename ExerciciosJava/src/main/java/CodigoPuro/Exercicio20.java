//Desafio 20: O mesmo professor do desafio anterior que sortear a ordem de apresentação de trabalhos dos alunos. 
//Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.

package CodigoPuro;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio20 {
    
    public static void main(String args[]){
        
        //Criando uma lista String
        String[] alunos = {"Alexa","Dakota","Candice","Tegan"};
        
        //Criando um novo objeto Random
        Random escolhaRandom = new Random();
        
        //Iremos usar o objeto Random para escolhar um numero aleatorio  
        //de acordo com o tamanho da lista de alunos
        int indexAleatorio = escolhaRandom.nextInt(alunos.length);        
        
        //Criando uma lista Integer
        ArrayList<Integer> listaNumeros = new ArrayList<>();        
        
        //Adicionando 4 numeros a lista Integer acima
        for (int i = 0; i<=3;i++){
            listaNumeros.add(i);            
        }        
        
        //Usando da biblioteca Collections para embaralharmos os numeros na lista
        Collections.shuffle(listaNumeros);
        
        //Imprimindo a lista de alunos seguindo uma ordem index aleatoria de acordo
        //com a lista de numeros acima
        System.out.println("Segue lista de alunos sorteados e sua ordem de chamada:");
        for (int i=0; i<alunos.length;i++){
            System.out.printf("%dº: %s\n",i+1,alunos[listaNumeros.get(i)]);
        }
    
    }    
}
