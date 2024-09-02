package livro.info;

public class Livro {
    String titulo;
    double preco;
    String autor;
    int ano_publicacao;

    void imprimirInfo(){
        System.out.println(" Título: " + titulo + "| Preço: " + preco + "| Autor: " + autor + "| Ano da Publicação: " + ano_publicacao);
    }
}
