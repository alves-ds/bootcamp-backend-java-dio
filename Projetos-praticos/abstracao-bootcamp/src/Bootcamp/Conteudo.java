package Bootcamp;

public abstract class Conteudo {

    // Atributos
    final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    // Metodo construtor
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Metodos get para titulo e descricao
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Metodos set para titulo e descricao
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();

}
