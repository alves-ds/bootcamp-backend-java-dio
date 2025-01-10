package Bootcamp;

public class Main {

    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Teste", "Bootcamp de teste");
        bootcamp.exibirDevs();
        bootcamp.inscreverDev("Douglas");
        bootcamp.exibirDevs();
        bootcamp.inscreverDev("Lucas");
        bootcamp.exibirDevs();
        bootcamp.exibirConteudos();
        bootcamp.adicionarConteudo(new Curso("Curso Teste", "Curso de teste", 15));
        bootcamp.exibirConteudos();
        bootcamp.adicionarConteudo(new Mentoria("Mentoria teste", "Mentoria de teste"));
        bootcamp.exibirConteudos();
        bootcamp.removerConteudo("Curso Teste");
        bootcamp.exibirConteudos();
    }

}
