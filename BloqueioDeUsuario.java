import java.util.Scanner;
public class BloqueioDeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "aluno";
        String senhaCorreta = "segredo";
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Digite o nome : ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Bem-vindo!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
                tentativas++;
                if (tentativas == 3) {
                    System.out.println("Você excedeu o número máximo de tentativas.");
                    System.out.println("Sua conta está bloqueada. Entre em contato com o suporte.");
                    break;
                }
            }
        }
        scanner.close();
    }
}

