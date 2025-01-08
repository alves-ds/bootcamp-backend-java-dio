package BancoAbs;

public interface IConta {

  public void exibirSaldo();

  public void depositarDinheiro(double valor);

  public void sacarDinheiro(double valor);

  public void transferirDinheiro(double valor, Cliente contaDestino);


}
