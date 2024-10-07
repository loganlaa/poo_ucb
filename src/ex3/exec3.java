package ex3;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }


}

class ListaAluno {
    private List<Aluno> alunos;

    public ListaAluno() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome);
            System.out.println(aluno.nota);
        }
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.nota;
        }
        return soma/alunos.size();
    }

}


public class exec3 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Cleyton", 4);
        Aluno a2 = new Aluno("Robson", 8);
        Aluno a3 = new Aluno("Valdemar", 10);

        ListaAluno l1 = new ListaAluno();

        l1.adicionarAluno(a1);
        l1.adicionarAluno(a2);
        l1.adicionarAluno(a3);
        l1.adicionarAluno(new Aluno("Lôgan", 9.5));

        l1.removerAluno(a2);
        l1.listarAlunos();

        System.out.println("Média: "+ l1.calcularMedia());




    }
}
