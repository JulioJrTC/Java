package CodigoPuro;

import java.util.Scanner;

public class TreinamentoJava {
    
    public static void main(String[] args){
        
        Scanner lerNumero = new Scanner(System.in);
    
        String numeroString;
        Double numeroDouble;
        int numeroInt;

        System.out.print("Digite um valor: ");
        numeroString = lerNumero.nextLine();
        
        if(numeroString.contains(",")){
            numeroString = numeroString.replace(",", ".");
        }
        
        numeroDouble=Double.valueOf(numeroString);
        numeroInt=(int)Math.floor(numeroDouble);
        
        
        System.out.println(numeroString);
        System.out.println(numeroDouble);
        System.out.println(numeroInt);
        
    }
    
    
    
    

}
