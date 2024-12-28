package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributos
    private Set<Produto> produtoSet;

    // Metodo construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Metodo para adicionar produtos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    // Metodo para exibir os produtos ordenados em ordem alfabetica se baseando na variavel nome
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>();
        produtoPorNome.addAll(produtoSet);
                return produtoPorNome;
    }

    // Metodo para exibir os protudos ordenados de forma crescente com base no preco
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new CompararPorPreco());
        produtoPorPreco.addAll(produtoSet);
                return produtoPorPreco;
    }

    // Testar a classe
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(51, "Escova", 10, 2);
        cadastro.adicionarProduto(52, "Pente", 5, 1);
        cadastro.adicionarProduto(53, "Secador", 100, 1);
        cadastro.adicionarProduto(54, "Chapinha", 100, 3);
        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
