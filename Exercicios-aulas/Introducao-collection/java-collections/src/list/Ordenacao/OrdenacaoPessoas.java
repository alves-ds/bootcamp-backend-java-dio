package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    // Atributos
    List<Pessoa> listaPessoas = new ArrayList<>();

    
    // Metodo construtor
    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    
    // Metodo para adicionar pessoas
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, idade));
    }

    // Metodo para ordenar a lista por idade
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    // Metodo para ordenar a lista por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    // Testar metodos
    public static void main(String[] args) {
        OrdenacaoPessoas ordenaPessoas = new OrdenacaoPessoas();
        ordenaPessoas.adicionarPessoa("Joao", 25, 1.75);
        ordenaPessoas.adicionarPessoa("Mario", 29, 1.77);
        ordenaPessoas.ordenarPorIdade();
    }
}
