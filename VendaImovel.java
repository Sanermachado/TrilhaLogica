import java.util.Scanner;

public class VendaImovel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do imovel: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o valor do imóvel: ");
        double valorImovel = scanner.nextDouble();

        scanner.close();

        // Calcula desconto
        double comissao;
        if (valorImovel >= 50000.00) {
            comissao = valorImovel * 0.20;
        } else if (valorImovel >= 30000.00) {
            comissao = valorImovel * 0.15;
        } else {
            comissao = valorImovel * 0.10;
        }

        //tela
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Valor do imóvel: R$" + valorImovel);
        System.out.println("Comissão do vendedor: R$" + comissao);
    }
}
