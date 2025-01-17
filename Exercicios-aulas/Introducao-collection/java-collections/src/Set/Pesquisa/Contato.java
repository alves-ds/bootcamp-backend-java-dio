package Set.Pesquisa;

public class Contato {

    // Atributos
    private String nome;
    private int numeroTelefone;
    

    // Metodo construtor
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }


    // Metodo get
    public String getNome() {
        return nome;
    }


    // Metodo get
    public int getNumeroTelefone() {
        return numeroTelefone;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


    // Metodo tostring
    @Override
    public String toString() {
        return "Contato [getNome()=" + getNome() + ", getNumeroTelefone()=" + getNumeroTelefone() + "]";
    }


    // Metodo set para o numero de telefone
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


}
