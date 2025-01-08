package BancoAbs;

public class Cliente {

 // Atributos
 private String nome;
 private int idadeCliente;
 private String endereco;
 private String cpf;

 private Conta contaPoupanca;
 private Conta contaCorrente;

 // Metodo construtor
public Cliente(String nome, int idadeCliente, String endereco, String cpf, double saldoPoupanca, double saldoCorrente) {
  this.nome = nome;
  this.idadeCliente = idadeCliente;
  this.endereco = endereco;
  this.cpf = cpf;
  this.contaPoupanca = new Conta(saldoPoupanca);
  this.contaCorrente = new Conta(saldoCorrente);
}



@Override
public String toString() {
    return "nome=" + nome + ", idade=" + idadeCliente + ", endereco=" + endereco + ", cpf=" + cpf + "]";
}



// Gerar hashcode para evitar a criação de dois clientes com CPF igual
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Cliente other = (Cliente) obj;
    if (cpf == null) {
        if (other.cpf != null)
            return false;
    } else if (!cpf.equals(other.cpf))
        return false;
    return true;
}

// Metodo get da conta poupanca
public Conta getContaPoupanca() {
  return contaPoupanca;
}

// Metodo get da conta corrente
public Conta getContaCorrente() {
  return contaCorrente;
}


}
