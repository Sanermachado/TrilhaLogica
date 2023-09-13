import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class RemoveNomeRepetidos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<String> nomesUnicos = new HashSet<>();
            System.out.println("Digite 20 nomes:");
            for (int i = 0; i < 20; i++) {
                System.out.print("Nome #" + (i + 1) + ": ");
                String nome = scanner.nextLine();
                nomesUnicos.add(nome);
            }
            System.out.println("Nomes únicos no vetor:");
            for (String nome : nomesUnicos) {
                System.out.println(nome);
            }
            scanner.close();
        }
    }


