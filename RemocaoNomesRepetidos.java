import java.util.Arrays;
import java.util.Scanner;

public class RemocaoNomesRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[20];
        String[] nomesUnicos;
        int tamanho = 0;

        // Ler os nomes
        System.out.println("Digite 20 nomes:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome #" + (i + 1) + ": ");
            String nome = scanner.nextLine();

            // Verificar se o nome já foi inserido anteriormente
            boolean repetido = false;
            for (int j = 0; j < tamanho; j++) {
                if (nomes[j].equalsIgnoreCase(nome)) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                nomes[tamanho] = nome;
                tamanho++;
            }
        }

        // Criar um novo array apenas com os nomes únicos
        nomesUnicos = Arrays.copyOf(nomes, tamanho);

        // Exibir os nomes únicos
        System.out.println("Nomes únicos no vetor:");
        for (String nome : nomesUnicos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
