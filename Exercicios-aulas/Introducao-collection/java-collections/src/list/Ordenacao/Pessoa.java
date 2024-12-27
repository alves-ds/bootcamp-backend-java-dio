package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

    // Atributos
    private String nome;
    private int idade;
    private double altura;
    

    // Metodo construtor
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    // Metodo get
    public String getNome() {
        return nome;
    }


    // Metodo get
    public int getIdade() {
        return idade;
    }


   // Metodo get
    public float getAltura() {
        return (float) altura;
    }


    // Metodo tostring
    @Override
    public String toString() {
        return "Pessoa [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getAltura()=" + getAltura() + "]";
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
    
}


class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}

