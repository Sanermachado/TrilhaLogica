import java.util.Scanner;

public class VendaBebidas {
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



          scanner.close();
     }
}
