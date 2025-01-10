package Bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    // Atributos
    LocalDate dataInicio;
    LocalDate dataFinal;

    // Metodo construtor
    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.dataInicio = LocalDate.now();
        this.dataFinal = this.dataInicio.plusDays(45);
    }

    // Metodo para calcular a quantidade de XP
    @Override
    public double calcularXp() {
        return this.XP_PADRAO;
    }

    @Override
    public String toString() {
        return "Titulo=" + getTitulo() + ", Descricao=" + getDescricao() + "]";
    }

    

}
