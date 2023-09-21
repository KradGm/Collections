package set.ListaDeAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private Double nota;

    public Aluno(String nome, long matricula, Double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public Double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return "Aluno nome = " + nome + " matricula = " + matricula + " nota = " + nota + "\n";
    }

    
}
class ComparatorPorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2) {
       return Double.compare(a1.getNota(), a2.getNota());
    }

}