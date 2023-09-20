package set.ConjuntoDePalavrasUnicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavraParaRemover) {
        for (String S : palavrasUnicasSet) {
            if (S.equalsIgnoreCase(palavraParaRemover)) {
                palavrasUnicasSet.remove(palavraParaRemover);
                break;
            }
        }
    }

    public void verificarPalavra(String palavraAVerificar) {
        if (palavrasUnicasSet.contains(palavraAVerificar)) {
            System.out.println("A palavra: " + palavraAVerificar + " Se encontra no seu Set.");
        } else {
            System.out.println("A palavra: " + palavraAVerificar + " Não esta presente.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Brazil");
        conjuntoPalavrasUnicas.adicionarPalavra("USA");
        conjuntoPalavrasUnicas.adicionarPalavra("Germany");
        conjuntoPalavrasUnicas.adicionarPalavra("Portugal");
        conjuntoPalavrasUnicas.adicionarPalavra("Chile");
        conjuntoPalavrasUnicas.adicionarPalavra("China");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Brazil");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Germany");

    }
}
