// Construida uma classe especifica para designar cada cliente
public class Cliente {
    
    // Declarados os atributos do cliente
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    // Metodo construtor do cliente
    public Cliente(int numeroConta, String agencia, String nomeCliente, float saldo){

        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

    }

    // Construcao dos metodos getters
    public int getNumeroConta(){

        return numeroConta;
        
    }

    public String getAgencia(){

        return agencia;

    }

    public String getNomeCliente(){

        return nomeCliente;

    }

    public float getSaldo(){

        return saldo;

    }


}
