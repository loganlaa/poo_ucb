package list.pessoa;

import java.util.ArrayList;

public class ArrayListTeste {
    public static void main(String[] args) {

        ArrayList<PessoaArray> pessoas = new ArrayList<>();
        PessoaArray p1 = new PessoaArray();
        p1.nome = "Lôgan";
        p1.idade = 21;

        PessoaArray p2 = new PessoaArray();
        p2.nome = "Rebeca";
        p2.idade = 18;

        pessoas.add(p1); // Adicionei p1 à lista pessoas
        pessoas.add(p2);

        for (PessoaArray p : pessoas) {
            System.out.println(p.nome);
        }

        System.out.println(pessoas.stream().count()); // Mostra o tamanho da lista

        pessoas.remove(0); // Remove o objeto por index

        for (PessoaArray p : pessoas){
            System.out.println(p.nome);
        }

    }
}
