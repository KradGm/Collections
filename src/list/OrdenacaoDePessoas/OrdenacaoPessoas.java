package list.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordemPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(ordemPorIdade);
        return ordemPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordemPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(ordemPorAltura, new ComparatorPorAltura());
        return ordemPorAltura;
    }

    public static void main(String[] args) {
    OrdenacaoPessoas listaDePessoas = new OrdenacaoPessoas();

    listaDePessoas.adicionarPessoa("João", 13, 1.60);
    listaDePessoas.adicionarPessoa("Pedro", 15, 1.80);
    listaDePessoas.adicionarPessoa("Augusto", 21, 1.75);
    listaDePessoas.adicionarPessoa("Maria", 25, 1.58);
    listaDePessoas.adicionarPessoa("Fernanda", 17, 1.68);
    listaDePessoas.adicionarPessoa("Julia", 12, 1.45);
    
    System.out.println("Essa é a ordenação crescente por altura de sua Lista: "+listaDePessoas.ordenarPorAltura());
    System.out.println(" ");
    System.out.println("Essa é a ordenação crescente por idade de sua Lista: "+listaDePessoas.ordenarPorIdade());
    }
}
