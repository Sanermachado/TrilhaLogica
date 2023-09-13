import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            double nota1, nota2, media;

            System.out.println("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println("Média final : " + media);

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Deseja realizar um novo cálculo? S/N: ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
