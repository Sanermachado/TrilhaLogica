import java.util.Scanner;
public class DivisaoDeValores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double numero1, numero2, resultado;
            System.out.println("Digite dois valores para a divisão.");
            System.out.print("Digite o primeiro valor: ");
            numero1 = scanner.nextDouble();
            do {
                System.out.print("Digite o segundo valor ");
                numero2 = scanner.nextDouble();

                if (numero2 == 0) {
                    System.out.println("O segundo valor não pode ser zero. Tente novamente.");
                }
            } while (numero2 == 0);
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
            scanner.close();
        }
    }
