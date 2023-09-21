package map.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Enzo", 123456);
        agendaContatos.adicionarContato("Erick", 12345622);
        agendaContatos.adicionarContato("Vitor", 123333);
        agendaContatos.adicionarContato("Vitao", 444455);
        agendaContatos.adicionarContato("Rayan", 6666);
        agendaContatos.adicionarContato("Debora", 777777);
        agendaContatos.adicionarContato("Enzo", 101010); // Atualizando um valor

        agendaContatos.exibirContatos();

        System.out.println("Pesquisando o nome e retornando o numero:  " + agendaContatos.pesquisarPorNome("Enzo"));
        agendaContatos.removerContato("Rayan");
        agendaContatos.removerContato("Vitao");
        agendaContatos.removerContato("Vitor");

        agendaContatos.exibirContatos();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println("Exibindo a agenda de contatos: " + agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

}
