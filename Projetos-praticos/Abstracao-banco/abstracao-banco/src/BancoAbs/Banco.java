package BancoAbs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Banco {

  // Atributos
  private HashSet<Cliente> listaClientes;

  // Metodo construtor
  public Banco() {
    this.listaClientes = new HashSet<>();
  }

  // Metodo para exibir a lista de clientes
  public void exibirClientes(){
    System.out.println(listaClientes);
  }

  // Metodo para adicionar um novo cliente
  public void adicionarCliente(Cliente cliente){
    if(!listaClientes.add(cliente)){
      System.out.println("O CPF informado já está cadastrado em nosso banco de dados!");
    } else{
      listaClientes.add(cliente);
      System.out.println("Cliente adicionado com sucesso!");
    }
    
  }
 
}
