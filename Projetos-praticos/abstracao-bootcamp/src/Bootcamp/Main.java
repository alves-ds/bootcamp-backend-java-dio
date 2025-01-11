package Bootcamp;

public class Main {

    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp de programação Java", "Te ensina a programar em Java");
        bootcamp.adicionarConteudo(new Curso("Introdução ao pensamento computacional", "Introdução ao pensamento computacional", 15));
        bootcamp.adicionarConteudo(new Mentoria("Mentoria teste", "Mentoria de teste"));
        /*bootcamp.exibirDevs();
        bootcamp.inscreverDev("Douglas");
        bootcamp.exibirDevs();
        bootcamp.inscreverDev("Lucas");
        bootcamp.exibirDevs();
        bootcamp.exibirConteudos();
        bootcamp.adicionarConteudo(new Curso("Introdução ao pensamento computacional", "Introdução ao pensamento computacional", 15));
        bootcamp.exibirConteudos();
        bootcamp.adicionarConteudo(new Mentoria("Mentoria teste", "Mentoria de teste"));
        bootcamp.exibirConteudos();
        bootcamp.removerConteudo("Curso Teste");
        bootcamp.exibirConteudos(); */

        Dev dev = new Dev("Douglas");
        dev.calcularTotalXp();
        dev.inscreverBootcamp(bootcamp);
        bootcamp.exibirDevs();
        dev.progredir();
    }

}
