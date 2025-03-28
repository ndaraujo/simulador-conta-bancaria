import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        usuario.numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        usuario.agencia = scanner.nextLine();
        
        System.out.println("Digite o valor do depósito: ");
        usuario.saldo = scanner.nextDouble();

        scanner.nextLine();
        
        System.out.println("Digite o seu nome: ");
        usuario.nomeCliente = scanner.nextLine();
        
        usuario.exibirUsuario();
        
    }
}
