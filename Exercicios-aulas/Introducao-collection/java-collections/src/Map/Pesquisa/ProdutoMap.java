package Map.Pesquisa;

public class ProdutoMap {

    // Atributos
    private long cod;
    private String nome;
    private int quantidade;
    private double preco;
    
    // Metodo construtor
    public ProdutoMap(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Metodo get
    public long getCod() {
        return cod;
    }

    // Metodo get
    public String getNome() {
        return nome;
    }

    // Metodo get
    public int getQuantidade() {
        return quantidade;
    }

    // Metodo get
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome=" + getNome() + ", Quantidade=" + getQuantidade()
                + ", Preco=" + getPreco() + "]";
    }

    

}
