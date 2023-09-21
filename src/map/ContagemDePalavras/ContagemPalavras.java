package map.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemDePalavrasMap;
    
    public ContagemPalavras() {
        this.contagemDePalavrasMap = new HashMap<>();
    }
    public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();

    contagemPalavras.adicionarPalavra("Oi", 1);
    contagemPalavras.adicionarPalavra("tudo", 4);
    contagemPalavras.adicionarPalavra("bem?", 3);
    contagemPalavras.adicionarPalavra("Sim", 6);

    contagemPalavras.exibirContagemPalavras();
    
    System.out.println("Palavra mais frequente: " +contagemPalavras.encontrarPalavraMaisFrequente());

    contagemPalavras.removerPalavra("Sim");

    contagemPalavras.exibirContagemPalavras();
    
    System.out.println("Palavra mais frequente agora: " +contagemPalavras.encontrarPalavraMaisFrequente());

    }


    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemDePalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemDePalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println("Total de palavras: " + contagemDePalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisRepetida = null;
        int maiorContagem = 0;
        if (!contagemDePalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemDePalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisRepetida = entry.getKey();
                }
            }
        }
        return palavraMaisRepetida;
    }
}
