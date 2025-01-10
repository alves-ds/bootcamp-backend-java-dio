package Bootcamp;

public class Curso extends Conteudo {

    // Atributos
    private int cargaHoraria;

    // Metodo construtor
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    // Metodo get de carga horaria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Metodo set de carga horaria
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    // Metodo para calcular o xp
    @Override
    public double calcularXp() {
        return this.XP_PADRAO;
    }

    @Override
    public String toString() {
        return "[CargaHoraria=" + cargaHoraria + ", Titulo =" + getTitulo() + ", Descricao ="
                + getDescricao() + "]";
    }

    
}
