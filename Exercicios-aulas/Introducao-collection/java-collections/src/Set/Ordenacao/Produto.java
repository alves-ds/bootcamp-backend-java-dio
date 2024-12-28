package Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    // Atributos
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;
    
    // Metodo construtor da classe
    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodo get
    public String getNome() {
        return nome;
    }

    // Metodo get
    public long getCod() {
        return cod;
    }

    // Metodo get
    public double getPreco() {
        return preco;
    }

    // Metodo get
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    // Metodo tostring
    @Override
    public String toString() {
        return "Produto =" + getNome() + ", Codigo=" + getCod() + ", Preco=" + getPreco()
                + ", Quantidade=" + getQuantidade() + "]";
    }

    // Metodo compareTo para podermos ordenar o nosso conjunto com base na variavel nome
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}

// Criar classe para compararmos os objetos com base no preco e podermos ordenados de forma crescente
class CompararPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

    
}
