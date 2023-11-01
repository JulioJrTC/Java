package CodigoPuro;

public class Exercicio12 {
    public static void main (String[] args){
        
        //Variaveis double para o preço do produto e o novo preço aplicado ao desconto
        double produto,novoPreco;
        
        //Variavel para o desconto
        int desconto;
        
        //Variavel cosmetica
        String ponto;        
        ponto="%";
        
        //Preço de um produto
        produto=1500;
        
        //Desconto que será aplicado ao produto acima
        desconto=5;        
        
        //Novo preço, aplicado desconto
        novoPreco=produto-(produto*desconto)/100;
        
        //Imprimindo o produto já aplicado o desconto
        System.out.printf("O produto que antes custava R$%.2f, agora com %d%s de desconto irá custar R$%.2f.",produto,desconto,ponto,novoPreco);
        
    }    
}
