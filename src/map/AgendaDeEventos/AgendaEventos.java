package map.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 12, 24), "Ceia de natal", "Papai noel");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 12, 30), "Ano novo", "Fogos de artificio");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        // Set<LocalDate> dateSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        // o Map.Entry cria a relação entre os valores acima, pois da forma como fiz eles seriam não relacionados.
        //eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proxmiEvento = null;
        for(Map.Entry<LocalDate, Evento> entry:eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proxmiEvento = entry.getValue();
                System.out.println("O proximo evento: "+proxmiEvento+"Acontecera na data: "+proximaData);
            }
        }
    }


    
}
