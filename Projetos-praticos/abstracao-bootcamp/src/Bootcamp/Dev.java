package Bootcamp;

import java.util.HashSet;
import java.util.Set;

public class Dev {

    // Atributo estático para garantir IDs únicos
    private static int ID_PADRAO = 1;

    // Atributos
    private String nome; 
    private int ID;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;
    
    // Metodo construtor
    public Dev(String nome) {
        this.nome = nome;
        this.ID = ID_PADRAO++;
        this.conteudosInscritos = new HashSet<>();
        this.conteudosConcluidos = new HashSet<>();
    } 

    // Metodo para se inscrever em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this); // Adiciona o Dev ao Bootcamp
        System.out.println(nome + " inscrito no Bootcamp: " + bootcamp.getNome());
    }

    // Metodo para concluir um curso e avançar no bootcamp
    public void progredir() {
        // Verifica se há conteúdos inscritos
        if (!conteudosInscritos.isEmpty()) {
            // Avança o primeiro conteúdo da lista de inscritos
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosConcluidos.add(conteudo); // Adiciona aos concluídos
            conteudosInscritos.remove(conteudo); // Remove dos inscritos
            System.out.println("Progrediu no conteúdo: " + conteudo.getTitulo());
        } else {
            System.out.println("Você já concluiu todos os conteúdos!");
        }
    }

    // Metodo para calcular o XP total do Dev
    public void calcularTotalXp(){
            System.out.println(conteudosConcluidos.size()*10);
        
    }

    // Atribuir hashcode para a variável ID, para garantir IDs únicos
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
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
        Dev other = (Dev) obj;
        if (ID != other.ID)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Nome= " + nome + ", ID=" + ID + "]";
    }

    

}
