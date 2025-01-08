

/**
 * Class CConta
 */
public class CConta implements IConta {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public CConta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  abstract public void exibirSaldo();


  /**
   * @param        valor
   */
  abstract public void depositarDinheiro(double valor);


  /**
   * @param        valor
   */
  abstract public void sacarDinheiro(double valor);


  /**
   * @param        valor
   */
  abstract public void transferirDinheiro(double valor);


}
