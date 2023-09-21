package map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProduto {
    private Map<Long, Produto> estoqueDeProdutosMap;

    public EstoqueDeProduto() {
        this.estoqueDeProdutosMap = new HashMap<>();
    }

    public static void main(String[] args) {
        EstoqueDeProduto estoqueDeProduto = new EstoqueDeProduto();

        estoqueDeProduto.adicionarProduto(10, "Bala", 100, 0.50);
        estoqueDeProduto.adicionarProduto(15, "Refrigerante", 50, 4);
        estoqueDeProduto.adicionarProduto(5, "Pão de queijo", 15, 6);

        estoqueDeProduto.exibirProdutos();

        System.out.println(estoqueDeProduto.calcularValorTotalEstoque());

        System.out.println("Produto mais barato: " + estoqueDeProduto.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoqueDeProduto.obterProdutoMaisCaro());

        System.out.println(estoqueDeProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoqueProduto());

    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueDeProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println("Todos os produtos em esotque: " + estoqueDeProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueDeProdutosMap.isEmpty()) {
            for (Produto p : estoqueDeProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueDeProdutosMap.isEmpty()) {

            for (Produto p : estoqueDeProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueDeProdutosMap.isEmpty()) {
            for (Produto P : estoqueDeProdutosMap.values()) {
                if (P.getPreco() < menorPreco) {
                    produtoMaisBarato = P;
                    menorPreco = P.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoqueProduto() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueDeProdutosMap.isEmpty()) {
            for (Produto P : estoqueDeProdutosMap.values()) {
                double valorProdutoEmEstoque = P.getPreco() * P.getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = P;
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
}
