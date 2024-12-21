package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        System.out.println("tarefa " + descricao + " adicionada com sucesso!");
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equals(descricao)){
                listaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(listaParaRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoes(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println(listatarefa.obterNumeroTarefas());
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listatarefa.obterNumeroTarefas());
        listatarefa.removerTarefa("Tarefa 2");
        System.out.println(listatarefa.obterNumeroTarefas());
        listatarefa.obterDescricoes();
    }

}
