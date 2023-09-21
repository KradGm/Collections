package set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaDeContatosSet;

    public AgendaContatos() {
        this.agendaDeContatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaDeContatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaDeContatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> nomesEncontradosSet = new HashSet<>();
        for (Contato C : agendaDeContatosSet) {
            if (C.getNome().contains(nome)) {
                nomesEncontradosSet.add(C);
            }
        }
        return nomesEncontradosSet;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato C : agendaDeContatosSet) {
            if (C.getNome().equalsIgnoreCase(nome)) {
                C.setNumeroTelefone(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatosAtual = new AgendaContatos();

        agendaContatosAtual.adicionarContato("Erick", 1);
        agendaContatosAtual.adicionarContato("Enzo", 2);
        agendaContatosAtual.adicionarContato("EnzoErick", 3);
        agendaContatosAtual.exibirContatos();

        agendaContatosAtual.atualizarNumeroContato("Enzo", 2425);
        agendaContatosAtual.exibirContatos();
        System.out.println(agendaContatosAtual.pesquisarPorNome("Enzo"));

    }
}
