import java.util.Scanner;
public class VerificacaoDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome #" + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Digite um nome para verificar se está no sistrema: ");
        String nomeParaVerificar = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeParaVerificar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Encontra-se no sistema");
        } else {
            System.out.println("Não se encontra no sistema");
        }
        scanner.close();
    }
}
