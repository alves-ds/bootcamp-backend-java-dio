
import java.util.*;


/**
 * Class Banco
 */
public class Banco {

  //
  // Fields
  //

  private List<Cliente> listaClientes;
  
  //
  // Constructors
  //
  public Banco () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of listaClientes
   * @param newVar the new value of listaClientes
   */
  public void setListaClientes (List<Cliente> newVar) {
    listaClientes = newVar;
  }

  /**
   * Get the value of listaClientes
   * @return the value of listaClientes
   */
  public List<Cliente> getListaClientes () {
    return listaClientes;
  }

  //
  // Other methods
  //

  /**
   * @return       List<Cliente>
   */
  private List<Cliente> exibirClientes()
  {
  }


  /**
   * @return       Cliente
   */
  private Cliente adicionarCliente()
  {
  }


}
