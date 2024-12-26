package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos
    private List<Livro> listaLivro;

    // Metodo construtor da lista
    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    // Metodo para adicionar livros na lista
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }


    // Pesquisar livros por autor e retornar uma lista com os livros encontrados
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaAutor = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for(Livro l: listaLivro){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaAutor.add(l);
                }
            } 
        }
                return listaAutor; 
    }
    
    // Pesquisar livros publicados em um determinado intervalo de anos e retornar uma lista com os livros encontrados
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaAnos = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for(Livro l: listaLivro){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaAnos.add(l);
                }
            }
        }
                return listaAnos;
    }

    // Pesquisar livros por titulo e retornar o primeiro livro encontrado
    public void pesquisarPorTitulo(String titulo){
        if(!listaLivro.isEmpty()){
            for(Livro l: listaLivro){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println("O livro encontrado se chama: " + l.getTitulo());
                }
            }
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("DBZ", "Akira Toryiama", 2000);
        catalogoLivros.adicionarLivro("DBZ2", "Akira Toryiama", 2001);
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1000, 2000));
        System.out.println(catalogoLivros.pesquisarPorAutor("Akira Toryiama"));
        catalogoLivros.pesquisarPorTitulo("DBZ");
    }

}
