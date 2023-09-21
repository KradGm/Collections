package set.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;
    
    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }
    
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        cadastroProdutos.adicionarProduto(101112, "Xbox Series X", 3100, 10);
        cadastroProdutos.adicionarProduto(123, "PS4", 2500, 10);
        cadastroProdutos.adicionarProduto(456, "PS5", 3500, 10);
        cadastroProdutos.adicionarProduto(789, "Xbox", 2100, 10);
    
        System.out.println("Produtos por Nome: "+cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Produtos por Preço: "+cadastroProdutos.exibirProdutosPorPreco());
    }
    
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {

        produtosSet.add(new Produto(nome, cod, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }


}
