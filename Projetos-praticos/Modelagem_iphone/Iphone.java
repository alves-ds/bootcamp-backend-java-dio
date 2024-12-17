

/**
 * Class Iphone
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

   // Fields
  private String musica;
  private String url;
  private String numero;


  // Constructors
  public Iphone () { 
    this.musica = "Nenhuma";
    this.url = "Home";
    this.numero = null;
  };
  

  // Methods
  @Override
  public void tocar() {
    System.out.println("Iphone tocando!");
  }

  @Override
  public void pausar() {
    System.out.println("Parei de tocar!");
  }


  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando a musica: " + musica);
  }


  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para o numero: " + numero);
  }


  @Override
  public void atender() {
    System.out.println("Atendendo o telefone!");
  }


  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz!");
  }


  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo a pagina: " + url);
  }


  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba!");
  }


  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando pagina!");
  }


}
