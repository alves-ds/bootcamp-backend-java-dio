package BancoAbs;

public class Conta implements IConta {

  // Atributos
  private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
  private int agencia;
  private int numeroConta;
  private double saldo;

  // Metodo construtor
  public Conta(double saldo) {
      this.agencia = Conta.AGENCIA_PADRAO;
      this.numeroConta = Conta.SEQUENCIAL++;
    this.saldo = saldo;
  }

  @Override
  public void exibirSaldo() {
    System.out.println("O seu saldo atual é: " + saldo);
  }

  @Override
  public void depositarDinheiro(double valor) {
    saldo += valor;
    System.out.println("Depósito realizado com sucesso! Seu saldo atual é de: R$ " + saldo + " reais!");
  }

  @Override
  public void sacarDinheiro(double valor) {
    saldo -= valor;
    System.out.println("Saque realizado com sucesso! Seu saldo atual é de: R$ " + saldo + " reais!");
  }

  @Override
  public void transferirDinheiro(double valor, Cliente contaDestino) {
    if(valor <= saldo){
      this.sacarDinheiro(valor);
      contaDestino.getContaPoupanca().depositarDinheiro(valor);
    } else{
      System.out.println("Saldo insuficiente no momento!");
    }
    
  }


}
