package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    // Atributos
    private Map<LocalDate, Evento> agendaEventos;

    // Metodo construtor
    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    // Metodo para adicionar eventos na agenda
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventos.put(data, new Evento(nome, atracao));
    }

    // Metodo para exibir a agenda de eventos em ordem crescente de data
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaEventos);
        System.out.println(eventosOrdenados);
    }

    // Metodo para retornar o proximo evento que ocorrera
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventos);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

    // Testar a classe
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2010, 7, 5), "Nome 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 2), "Nome 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 5), "Nome 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
