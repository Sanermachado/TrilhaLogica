import java.util.Scanner;

public class VendasDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à nossa loja de bebidas!");
        System.out.println("1. Água - R$2.00");
        System.out.println("2. Cerveja - R$5.00");
        System.out.println("3. Refrigerante - R$3.00");
        System.out.print("Por favor, escolha a bebida desejada (1/2/3): ");

        int escolha = scanner.nextInt();

        double preco = 0.0;
        String bebida = "";
        double valorTotal = 0.0;

        switch (escolha) {
            case 1:
                bebida = "Água";
                preco = 2.00;
                System.out.println("Você escolheu " + bebida + " por R$" + preco);

                break;
            case 2:
                bebida = "Cerveja";
                preco = 5.00;
                System.out.print("Você possui 18 anos ou mais ? \n Responda \n 1 para Sim \n 2 para Não");
                int respostaIdade = scanner.nextInt();
                if ( respostaIdade == 2){
                    System.out.print(" compra negada");
                }else {}
                System.out.println("Você escolheu " + bebida + " por R$" + preco);
                break;
            case 3:
                bebida = "Refrigerante";
                preco = 3.00;
                System.out.println("Você escolheu " + bebida + " por R$" + preco);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                return;

        }


        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double subtotal = preco * quantidade;

        scanner.nextLine();
        double desconto = 0.0;

        if (quantidade > 10 && quantidade <= 20) {
            desconto = subtotal * 0.10;
        } else if (quantidade > 20 && quantidade <= 50) {
            desconto = subtotal * 0.20;
        } else if (quantidade > 50) {
            desconto = subtotal * 0.25;
        }

        double totalComDesconto = subtotal - desconto;

        System.out.println("Produto: " + bebida);
        System.out.println("Preço unitário: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$" + subtotal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total com desconto: R$" + totalComDesconto);

        valorTotal += totalComDesconto;

        scanner.close();
    }
}
