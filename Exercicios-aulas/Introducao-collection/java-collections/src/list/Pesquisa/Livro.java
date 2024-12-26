package list.Pesquisa;

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    

    // Metodo construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Metodo get
    public String getTitulo() {
        return titulo;
    }


    // Metodo get
    public String getAutor() {
        return autor;
    }


    // Metodo get
    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    // Metodo ToString
    
    @Override
    public String toString() {
        return "Livro [getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getAnoPublicacao()="
                + getAnoPublicacao() + "]";
    }

}
