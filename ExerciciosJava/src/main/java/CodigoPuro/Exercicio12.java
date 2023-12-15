package CodigoPuro;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        //Scanner para o input de numeros
        Scanner lerNumero = new Scanner(System.in);

        double valorProduto;

        //Mecanica de erro
        while (true) {
            try {
                //Solicitando um valor monetario ao usuario
                System.out.print("Digite o valor de seu produto: R$");
                valorProduto = Double.parseDouble(lerNumero.nextLine());
                break;

            } catch (NumberFormatException ERRO) {
                System.out.println("Erro! Digite um valor numero monetario (com um ponto como separador)");

            }

        }

        //Desconto para o produto acima
        int desconto = 5;

        //Novo preço já com o desconto acima aplicado
        double novoPreco = valorProduto - (valorProduto * desconto / 100);

        //Texto cosmetico
        String percent = "%";

        //Imprimindo resultado
        System.out.printf("O produto que antes custava R$ %.2f, com %d%s de desconto irá custar R$ %.2f.", valorProduto, desconto, percent, novoPreco);
        //System.out.println(novoPreco);

    }

}
