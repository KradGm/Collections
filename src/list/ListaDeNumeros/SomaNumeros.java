package list.ListaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros(){
        this.listaDeNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        if (!listaDeNumeros.isEmpty()) {
            for (Integer integer : listaDeNumeros) {
                resultado += integer;
            }
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!listaDeNumeros.isEmpty()) {
            for (Integer integer : listaDeNumeros) {
                if (maiorNumero <= integer) {
                    maiorNumero = integer;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaDeNumeros.isEmpty()) {
            for (Integer integer : listaDeNumeros) {
                if (menorNumero > integer) {
                    menorNumero = integer;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> exibirNumeros() {
        List<Integer> numerosNaLista = new ArrayList<>();
        for (Integer integer : listaDeNumeros) {
            numerosNaLista.add(integer);
        }
        return numerosNaLista;
    }
    public static void main(String[] args) {
    SomaNumeros listaDeNumeros = new SomaNumeros();

    listaDeNumeros.adicionarNumero(0);
    listaDeNumeros.adicionarNumero(1);
    listaDeNumeros.adicionarNumero(3);
    listaDeNumeros.adicionarNumero(4);
    listaDeNumeros.adicionarNumero(5);

    System.out.println(listaDeNumeros.calcularSoma());
    System.out.println("Esse é o maior numero na sua Lista: "+listaDeNumeros.encontrarMaiorNumero());
    System.out.println("Esse é o menor numero na sua Lista: "+listaDeNumeros.encontrarMenorNumero());
    System.out.println("Esses são os valores na sua Lista: "+listaDeNumeros.exibirNumeros());

    }
}
