package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // Atributos
    private Map<String, Integer> agendaContatos;

    // Metodo construtor
    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    // Metodo para adicionar contatos na agenda
    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    // Metodo para remover contatos da agenda com base no nome fornecido
    public void removerContato(String nome){
        if(!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    // Metodo para exibir a agenda de contatos
    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    // Metodo para pesquisar um contato pelo nome e retornar o numero de telefone
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatos.isEmpty()){
            numeroPorNome= agendaContatos.get(nome);
        }
                return numeroPorNome;
    }

    // Testar a classe criada
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Douglas", 56789);
        agendaContatos.adicionarContato("Lucas", 56756);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Douglas");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Lucas"));
    }

}
