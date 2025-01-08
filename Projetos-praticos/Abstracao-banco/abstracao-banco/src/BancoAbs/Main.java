package BancoAbs;
public class Main {

    // Teste da classe Banco
    public static void main(String[] args) {
        /*Banco banco = new Banco();
        banco.exibirClientes();
        banco.adicionarCliente(new Cliente("Douglas", 25, "Terra do nunca", "jkasdhashdgashdghas", 10, 0));
        banco.exibirClientes();
        banco.adicionarCliente(new Cliente("Lucas", 27, "Terra do nunca", "shduiashduhasudhuas", 15, 20));
        banco.exibirClientes(); */
        
        // Teste da classe Cliente
        Cliente cliente = new Cliente("Douglas", 25, "Terra do nunca", "jkasdhashdgashdghas", 10, 0);
        Cliente clienteDestino = new Cliente("Caio", 25, "Terra do nunca", "hsahdahsdhasgd", 0, 0);
        cliente.getContaPoupanca().exibirSaldo();
        cliente.getContaPoupanca().depositarDinheiro(15);
        cliente.getContaPoupanca().exibirSaldo();
        cliente.getContaPoupanca().transferirDinheiro(10, clienteDestino);
        clienteDestino.getContaPoupanca().exibirSaldo();
    }

}
