package map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("Dormir", "descansar em estado de sono.");
    dicionario.adicionarPalavra("Jogar", "divertir-se, entreter-se com (um jogo).");

    dicionario.exibirPalavras();

    System.out.println("Pesquisando palavra: "+ dicionario.pesquisarPorPalavra("Dormir"));

    dicionario.removerPalavra("Jogar");

    dicionario.exibirPalavras();

    }

    public void adicionarPalavra(String palavra, String definicao){
    dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println("Palavras no Dicionario: "+ dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoCorrespontende = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoCorrespontende = dicionarioMap.get(palavra);
        }
        return definicaoCorrespontende;
    }

}
