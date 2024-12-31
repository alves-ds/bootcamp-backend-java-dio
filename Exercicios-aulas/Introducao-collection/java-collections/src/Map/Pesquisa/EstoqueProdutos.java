package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Atributos
    private Map<Long, ProdutoMap> estoqueProdutos;

    // Metodo construtor
    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    // Metodo para adicionar novos produtos ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new ProdutoMap(nome, quantidade, preco));
    }

    // Metodo para exibir os produtos do estoque
    public void exibirProdutos(){
        System.out.println(estoqueProdutos.values());
    }

    // Metodo para calcular o valor total do estoque
    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!estoqueProdutos.isEmpty()){
            for(ProdutoMap p: estoqueProdutos.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
                return valorTotal;
    }

    // Metodo para retornar o produto mais caro
    public ProdutoMap obterProdutoMaisCaro(){
        ProdutoMap objetoMaisCaro = null;
        double maiorPreco = 0;
        if(!estoqueProdutos.isEmpty()){
            for(ProdutoMap p: estoqueProdutos.values()){
                if(p.getPreco() > maiorPreco){
                    objetoMaisCaro = p;
                }
            }
        }
                return objetoMaisCaro;
    }

    // Metodo para obter o produto mais barato
    public ProdutoMap obterProdutoMaisBarato(){
        ProdutoMap objetoMaisBarato = null;
        double menorPreco = 100000000;
        if(!estoqueProdutos.isEmpty()){
            for(ProdutoMap p: estoqueProdutos.values()){
                if(p.getPreco() < menorPreco){
                    objetoMaisBarato = p;
                }
            }
        }
                return objetoMaisBarato;
    }

    // Metodo para obter o produto cujo produto da quantidade pelo valor retorna o MAIOR VALOR
    public ProdutoMap obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        ProdutoMap produtoMaiorQuantidadeEValor = null;
        double menorQtdEValor = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(ProdutoMap p: estoqueProdutos.values()){
                if((p.getPreco()*p.getQuantidade()) > menorQtdEValor){
                    produtoMaiorQuantidadeEValor = p;
                }
            }
        }
                return produtoMaiorQuantidadeEValor;
    }

    // Testar a classe
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(10, "Detergente", 10, 2);
        estoqueProdutos.adicionarProduto(11, "Amaciante", 12, 11);
        estoqueProdutos.adicionarProduto(12, "Sabonete", 14, 5);
        estoqueProdutos.adicionarProduto(13, "Shampoo", 10, 10);
        estoqueProdutos.adicionarProduto(14, "Creme dental", 10, 12);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
