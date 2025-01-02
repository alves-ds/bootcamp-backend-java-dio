package Map.Ordenacao;

public class Evento {

    // Atributos
    private String nomeEvento;
    private String nomeAtracao;
    
    // Metodo construtor
    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    // Metodo get
    public String getNomeEvento() {
        return nomeEvento;
    }

    // Metodo get
    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento = " + getNomeEvento() + ", Atracao = " + getNomeAtracao() + "]";
    }


}
