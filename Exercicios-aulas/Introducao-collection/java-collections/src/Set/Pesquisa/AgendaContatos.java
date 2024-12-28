package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // Atributos
    private Set<Contato> contatoSet;

    // Metodo construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Metodo para adicionar um contato na agenda
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    // Metodo para exibir os contatos da agenda
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    // Metodo para pesquisar contatos pelo nome e retornar um conjunto com os contatos encontrados
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
                return contatosPorNome;
    }

    // Metodo para atualizar o numero de telefone de um contato
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
            }
        }
                return contatoAtualizado;
    }

    // Testar classe
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Douglas Santos", 52341);
        agenda.adicionarContato("Douglas Silveira", 52344);
        agenda.adicionarContato("Lucas", 53147);
        agenda.adicionarContato("Marcos", 694123);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Douglas"));
        agenda.atualizarNumeroContato("Douglas Silveira", 3220);
        System.out.println(agenda.pesquisarPorNome("Douglas"));
    }

}
