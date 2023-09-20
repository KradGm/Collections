package list.CatalogoDeLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros;
    public CatalogoLivros(){
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> autoresList = new ArrayList<>();

        for (Livro L : listaDeLivros) {
            if (L.getAutor().equalsIgnoreCase(autor)) {
                autoresList.add(L);
            }
        }
        return autoresList;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        for (Livro L : listaDeLivros) {
            if(L.getAnoPublicacao()>=anoInicial && L.getAnoPublicacao()<=anoFinal){
                livrosNoIntervalo.add(L);
            }
        }
        return livrosNoIntervalo;
    }
    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosComOTitulo = new ArrayList<>();
        for (Livro L : listaDeLivros) {
            if(L.getTitulo().equalsIgnoreCase(titulo)){
                livrosComOTitulo.add(L);
            }
        }
        return livrosComOTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Zeno ", "Brothers", 2023);
        catalogoLivros.adicionarLivro("Non Java gameplay", "selia", 2006);
        catalogoLivros.adicionarLivro("TELEKINESES", "Travis Spott", 2003);
        System.out.println("A sua pesquisa por autor teve o seguinte resultado: "+catalogoLivros.pesquisarPorAutor("selia"));
        System.out.println("A sua pesquisa por intervalo teve o seguinte resultado: "+catalogoLivros.pesquisarPorIntervaloAnos(2003, 2007));
        System.out.println("A sua pesquisa por titulo teve o seguinte resultado: "+catalogoLivros.pesquisarPorTitulo("TELEKINESEs"));

        }
}
