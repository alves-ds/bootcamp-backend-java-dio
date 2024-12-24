package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Criar a lista carrinho de compras
    private List<Item> carrinhoCompras;

    
    // Metodo construtor, iniciando um arraylist vazio
    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    // Criar metodo para adicionar item
    public void adicionarItem(String nome, float preco, float quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    // Criar metodo para remover items
    public void removerItem(String nome, float preco, float quantidade){
        List<Item> itemARemover = new ArrayList<>();
        for(Item i: carrinhoCompras){
            if (i.getNome().equals(nome) && i.getPreco() == preco && i.getQuantidade() == quantidade) {
                itemARemover.add(i);
            }            
        }
        carrinhoCompras.removeAll(itemARemover);
    }

    // Criar metodo para calcular o valor total do carrinho, multiplicando o preco pela quantidade
    public void calcularValorTotalCarrinho(){
        float valorItem = 0;
        for(Item i: carrinhoCompras){
            valorItem = valorItem + (i.getPreco() * i.getQuantidade());
        }
        System.out.println("O valor total dos itens no carrinho eh: " + valorItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Bola", 10, 2);
        carrinho.adicionarItem("Sapato", 300, 4);
        carrinho.calcularValorTotalCarrinho();

        
    }
    

}
