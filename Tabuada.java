import java.util.Scanner;
    public class Tabuada {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            do {
                System.out.print("Digite um número inteiro entre 1 e 10: ");
                numero = scanner.nextInt();
                if (numero < 1 || numero > 10) {
                    System.out.println("Número fora do intervalo válido (1-10). Tente novamente.");
                }
            } while (numero < 1 || numero > 10);
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            scanner.close();
        }
}
