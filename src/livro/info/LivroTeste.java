package livro.info;

import produto.practice.Produto;

public class LivroTeste {
    public static void main(String[] args) {
        var livro1 = new Livro(); // Instanciei a classe
        livro1.titulo = "1984";  // Atribuindo valor
        livro1.preco = 49.90;
        livro1.autor = "George Orwell";
        livro1.ano_publicacao = 2010;


        livro1.imprimirInfo();



    }
}
