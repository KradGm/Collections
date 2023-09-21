package set.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;
    
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Pedro", 203041, 18.5);
        gerenciadorAlunos.adicionarAluno("Henrique", 203042, 13.2);
        gerenciadorAlunos.adicionarAluno("Guilherme", 203043, 27.3);
        gerenciadorAlunos.adicionarAluno("Matias", 203039, 21.2);

        System.out.println("Alunos por Nome: "+gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por Nota: "+gerenciadorAlunos.exibirAlunosPorNota());
        
        gerenciadorAlunos.exibirAlunos();

    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){

        for (Aluno A : alunosSet) {
            if(A.getMatricula() == matricula){
                alunosSet.remove(A);
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
    return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    alunosPorNota.addAll(alunosSet);
    return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

}
