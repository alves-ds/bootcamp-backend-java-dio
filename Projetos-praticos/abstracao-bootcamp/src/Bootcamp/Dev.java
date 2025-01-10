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
    public void inscreverBootcamp(Bootcamp bootcamp){
        System.out.println("Inscrito!");
    }

    // Metodo para concluir um curso e avançar no bootcamp
    public void progredir(){

    }

    // Metodo para calcular o XP total do Dev
    public double calcularTotalXp(){
            return 0;
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
