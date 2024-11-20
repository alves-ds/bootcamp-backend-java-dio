
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            // Mostrar uma mensagem de boas vindas
            System.out.println("Olá, seja bem vindo ao banco! Preencha abaixo com os seus dados pessoais!");

            // Solicitar o nome do cliente
            System.out.println("Por favor, digite o seu nome: ");
            String nomeCliente = scanner.nextLine();

            // Solicitar o numero da agencia
            System.out.println("Por favor, digite o numero da sua agencia: ");
            String agencia = scanner.nextLine();

            // Solicitar o numero da conta
            System.out.println("Por favor, digite o numero da sua conta: ");
            int numeroConta = scanner.nextInt(); // Salva o valor digitado na variavel
            scanner.nextLine();

            // Solicitar o saldo do cliente
            System.out.println("Por favor, digite o seu saldo: ");
            float saldo = scanner.nextFloat();
            scanner.nextLine();

            Cliente cliente = new Cliente(numeroConta, agencia, nomeCliente, saldo);

            // Imprimir uma mensagem de que a conta foi devidamente criada
            System.out.println("Olá " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.getAgencia() + " conta " + cliente.getNumeroConta()+ " e seu saldo R$ " + cliente.getSaldo() + " reais já está disponível para saque!");
        }
        
    }

}
