import java.util.Scanner;
public class VetoresEMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int quantidadeImpares = 0;
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor" + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 != 0) {
                quantidadeImpares++;
            }
        }
        System.out.println("Valores ímpares: " + quantidadeImpares);
        scanner.close();
    }
}
