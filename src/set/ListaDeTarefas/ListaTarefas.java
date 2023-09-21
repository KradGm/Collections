package set.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefas;

    
    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa T : listaDeTarefas) {
            if (T.getDescricao().equalsIgnoreCase(descricao)) {
                listaDeTarefas.remove(T);
                break;
            }
        }
    }
    public void exibirTarefas(){
        System.out.println(listaDeTarefas);
    }
    public int contarTarefas(){
        return listaDeTarefas.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> listaDeTarefaConcluidas = new HashSet<>();
    for (Tarefa T : listaDeTarefas) {
        if(T.isConcluido()){
            listaDeTarefaConcluidas.add(T);
        }
    }
        return listaDeTarefaConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> listaDeTarefaPendentes = new HashSet<>();
    for (Tarefa T : listaDeTarefas) {
        if(!T.isConcluido()){
            listaDeTarefaPendentes.add(T);
        }
    }
        return listaDeTarefaPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa T : listaDeTarefas) {
            if(T.getDescricao().equalsIgnoreCase(descricao)){
                T.setConcluido(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa T : listaDeTarefas) {
            if(T.getDescricao().equalsIgnoreCase(descricao)){
                T.setConcluido(false);
                break;
            }
        }
    }
    public void limparListaTarefas(){
        listaDeTarefas.clear();
    }

    public static void main(String[] args) {
    ListaTarefas listaTarefasAtual = new ListaTarefas();

    listaTarefasAtual.adicionarTarefa("Dormir");
    listaTarefasAtual.adicionarTarefa("Acordar");
    listaTarefasAtual.adicionarTarefa("Almoçar");
    listaTarefasAtual.adicionarTarefa("Jogar");
    listaTarefasAtual.adicionarTarefa("Programar");
    listaTarefasAtual.adicionarTarefa("Cozinhar");
    listaTarefasAtual.adicionarTarefa("Relaxar");

    listaTarefasAtual.exibirTarefas();
    System.out.println(" ");
    System.out.println("Numero de tarefas Atuais: "+listaTarefasAtual.contarTarefas());
    System.out.println(" ");

    listaTarefasAtual.removerTarefa("Dormir");
    listaTarefasAtual.exibirTarefas();

    System.out.println(" ");
    System.out.println("Numero de tarefas Atuais: "+listaTarefasAtual.contarTarefas());
    System.out.println(" ");

    listaTarefasAtual.marcarTarefaConcluida("Jogar");
    listaTarefasAtual.marcarTarefaConcluida("Almoçar");
    
    System.out.println("Concluidas: "+listaTarefasAtual.obterTarefasConcluidas());

    listaTarefasAtual.marcarTarefaPendente("Cozinhar");
    listaTarefasAtual.marcarTarefaPendente("Relaxar");

    System.out.println("Pendentes: " +listaTarefasAtual.obterTarefasPendentes());

    }
}
