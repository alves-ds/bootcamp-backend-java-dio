package Set.OperacoesBasicas;

public class Convidado {

    // Atributos
    private String nome;
    private int codigoConvite;
    

    // Metodo construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    // Metodo get
    public String getNome() {
        return nome;
    }


    // Metodo get
    public int getCodigoConvite() {
        return codigoConvite;
    }


    // Metodo tostring
    @Override
    public String toString() {
        return "Convidado [getNome()=" + getNome() + ", getCodigoConvite()=" + getCodigoConvite() + "]";
    }


    // Metodo para gerar o hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }


    // Metodo para garantir que dois convidados com o mesmo código de convite nao sejam cadastrados
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    
    
}
