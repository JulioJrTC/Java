package CodigoPuro;

public class Exercicio13 {
    public static void main(String[] args){
        //Variaveis double para o salario e novo salario (aplicado o aumento)
        double salario,novoSalario;
        
        //Variavel int para o % de aumento
        int aumento;
        
        //Variavel cosmetica para o "%"
        String percent;        
        percent="%";
        
        //Salario do empregado
        salario=1500;
        
        //% de aumento ao salario
        aumento=15;
        
        //Novo salario (aplicado aumento ao mesmo)
        novoSalario=salario+(salario*aumento/100);
        
        //Imprimindo novo salario
        System.out.printf("O salario do empregado em questão que antes era R$%.2f, agora com %d%s irá ser R$%.2f.",salario,aumento,percent,novoSalario);
        
    }    
}
