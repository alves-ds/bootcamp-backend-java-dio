package Bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    // Atributos
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;
    
    // Metodo inicializador 
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = LocalDate.now();
        this.dataFinal = this.dataInicial.plusDays(45);
        this.devsInscritos = new HashSet<>();
        this.conteudos = new HashSet<>();
    }

    // Metodo para inscrever novos devs no bootcamp
    public void inscreverDev(String nome){
        if(devsInscritos.add(new Dev(nome))){
            System.out.println("Dev inscrito com sucesso!");
        } else{
            System.out.println("Erro ao cadastrar o Dev");
        }

    }

    // Metodo para exibir os devs inscritos
    public void exibirDevs(){
        System.out.println(devsInscritos);
    }

    // Metodo para adicionar conteudos ao bootcamp
    public void adicionarConteudo(Conteudo conteudo){
        if(conteudos.add(conteudo)){
            System.out.println("Conteúdo adicionado com sucesso!");
        } else{
            System.out.println("Erro ao cadastrar o conteúdo!");
        }
    }

    // Metodo para remover um conteudo do bootcamp pelo nome
    public Set<Conteudo> removerConteudo(String titulo){
        Conteudo conteudoRemover = null;
        if(!conteudos.isEmpty()){
            for(Conteudo conteudo: conteudos){
                if(conteudo.getTitulo().equalsIgnoreCase(titulo)){
                    conteudoRemover = conteudo;
                    break;
                }
            }
        }
        conteudos.remove(conteudoRemover);        
        return conteudos;
    }

    // Metodo para exibir os conteudos do bootcamp
    public void exibirConteudos(){
        System.out.println(conteudos);
    }

    // Metodo get para conteudos
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Metodo get para devs inscritos
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    // Metodo get para o nome do bootcamp
    public String getNome() {
        return nome;
    }

    
    
}
