
import java.util.*;


/**
 * Class Cliente
 */
public class Cliente {

  //
  // Fields
  //

  private String nomeCliente;
  private int idadeCliente;
  private String enderecoCliente;
  private CConta contaCorrente;
  private CConta contaPoupanca;
  
  //
  // Constructors
  //
  public Cliente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nomeCliente
   * @param newVar the new value of nomeCliente
   */
  public void setNomeCliente (String newVar) {
    nomeCliente = newVar;
  }

  /**
   * Get the value of nomeCliente
   * @return the value of nomeCliente
   */
  public String getNomeCliente () {
    return nomeCliente;
  }

  /**
   * Set the value of idadeCliente
   * @param newVar the new value of idadeCliente
   */
  public void setIdadeCliente (int newVar) {
    idadeCliente = newVar;
  }

  /**
   * Get the value of idadeCliente
   * @return the value of idadeCliente
   */
  public int getIdadeCliente () {
    return idadeCliente;
  }

  /**
   * Set the value of enderecoCliente
   * @param newVar the new value of enderecoCliente
   */
  public void setEnderecoCliente (String newVar) {
    enderecoCliente = newVar;
  }

  /**
   * Get the value of enderecoCliente
   * @return the value of enderecoCliente
   */
  public String getEnderecoCliente () {
    return enderecoCliente;
  }

  /**
   * Set the value of contaCorrente
   * @param newVar the new value of contaCorrente
   */
  public void setContaCorrente (CConta newVar) {
    contaCorrente = newVar;
  }

  /**
   * Get the value of contaCorrente
   * @return the value of contaCorrente
   */
  public CConta getContaCorrente () {
    return contaCorrente;
  }

  /**
   * Set the value of contaPoupanca
   * @param newVar the new value of contaPoupanca
   */
  public void setContaPoupanca (CConta newVar) {
    contaPoupanca = newVar;
  }

  /**
   * Get the value of contaPoupanca
   * @return the value of contaPoupanca
   */
  public CConta getContaPoupanca () {
    return contaPoupanca;
  }

  //
  // Other methods
  //

}
