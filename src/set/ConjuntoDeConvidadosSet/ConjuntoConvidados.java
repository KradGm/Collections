package set.ConjuntoDeConvidadosSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado C : convidadoSet) {
            if (C.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = C;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("O set tem: " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("joao", 1);
        conjuntoConvidados.adicionarConvidado("Pedro", 2);
        conjuntoConvidados.adicionarConvidado("Henrique", 3);
        conjuntoConvidados.adicionarConvidado("Zeno", 4);
        conjuntoConvidados.adicionarConvidado("Cleber", 1);

        System.out.println("Agora o set tem: " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidado(1);

        conjuntoConvidados.exibirConvidados();

    }

}
