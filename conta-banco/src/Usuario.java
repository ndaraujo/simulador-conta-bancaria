public class Usuario {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void exibirUsuario() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}