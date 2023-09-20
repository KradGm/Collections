package list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> tarefasParaRemover = new ArrayList<>();
        for (Item t : carrinhoDeCompra) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                tarefasParaRemover.add(t);
            }
        }
        carrinhoDeCompra.removeAll(tarefasParaRemover);
    }

    public double calcularValorTotal() {
        double soma = 0;
        for (Item v : carrinhoDeCompra) {
            soma += v.getPreco() * v.getQuantidade();

        }
        return soma;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeComprasAtual = new CarrinhoDeCompras();

        carrinhoDeComprasAtual.adicionarItem("maça", 2.50, 2);
        carrinhoDeComprasAtual.adicionarItem("laranja", 5, 1);
        carrinhoDeComprasAtual.adicionarItem("abacate", 6.50, 5);
        carrinhoDeComprasAtual.exibirItens();
        System.out.println("O valor total é: " + carrinhoDeComprasAtual.calcularValorTotal());

        //Removendo a maça.
        carrinhoDeComprasAtual.removerItem("maça");
        System.out.println("O valor total é: "+carrinhoDeComprasAtual.calcularValorTotal());
        
        carrinhoDeComprasAtual.exibirItens();
    }
}
