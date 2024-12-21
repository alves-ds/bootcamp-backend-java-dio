package list.OperacoesBasicas;

public class Item {


    // Atributos
    private String nome;
    private float preco;
    private float quantidade;


    // Metodo construtor
    public Item(String nome, float preco, float quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodo get
    public String getNome(){
        return nome;
    }

    // Metodo get
    public float getPreco(){
        return preco;
    }

    // Metodo get
    public float getQuantidade(){
        return quantidade;
    }
}
