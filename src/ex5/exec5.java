package ex5;

//Sistema de Biblioteca
//Crie uma classe Livro que possui os seguintes atributos:
//      • titulo (String)
//      • autor (String)
//      • anoPublicacao (int)
//        Em seguida, crie uma classe Biblioteca que possui uma lista de livros (List<Livro>) e implemente os seguintes métodos:
//          • adicionarLivro(Livro livro): Adiciona um livro à lista.
//          • removerLivro(String titulo): Remove um livro pelo título.
//          • listarLivros(): Exibe todos os livros disponíveis.
//          • buscarPorAutor(String autor): Retorna todos os livros de um determinado autor.


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void removerLivro(String titulo) {  // modificar a lista de livros enquanto a está iterando isso não é permitido no java
        Iterator<Livro> iterator = livros.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.titulo.equalsIgnoreCase(titulo)) {
                iterator.remove(); // Remove o livro usando o iterador
                System.out.println("Livro removido com sucesso!");
                System.out.println();
                removed = true;
                break; // Sai do loop após remover o livro
            }
        }

    }

    public void listarLivros() {
        System.out.println("Livros: ");
        for (Livro livro : livros) {
            System.out.println(livro.titulo);
            System.out.println(livro.autor);
            System.out.println(livro.anoPublicacao);
            System.out.println();
        }
    }

    public void buscarPorAutor(String autor) {
        System.out.printf("Livros de %s: \n", autor);
        for (Livro livro : livros) {
            if (livro.autor.equalsIgnoreCase(autor)) {
                System.out.println(livro.titulo);
                System.out.println(livro.anoPublicacao);
                System.out.println();
            }

            }

    }
}

public class exec5 {
    public static void main(String[] args) {
        Livro l1 = new Livro("A revolução dos bichos", "George Orwell", 1984);
        Livro l2 = new Livro("Crime e Castigo", "Dostoyevski", 1800);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l1);
        biblioteca.listarLivros();
        biblioteca.buscarPorAutor("Dostoyevski");
        biblioteca.removerLivro("A revolução dos bichos");
        biblioteca.listarLivros();
    }
}