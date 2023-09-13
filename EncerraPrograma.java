import java.util.Scanner;
public class EncerraPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite números de entrada (digite 10 para sair):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == 10) {
                System.out.println("Você digitou 10. Saindo do programa.");
                break;
            } else {
                System.out.println("Você digitou: " + numero);
            }
        }
        scanner.close();
    }
}
