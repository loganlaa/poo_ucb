package produto.practice;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto arroz = new Produto(); // Instanciei a classe
        arroz.nome = "Tio João";  // Atribuindo valor
        arroz.preco = 50;
        arroz.desconto = 0.10;

        var feijao = new Produto();
        feijao.nome = "Valdemar";  // Atribuindo valor
        feijao.preco = 50;
        feijao.desconto = 0.40;

        System.out.println("Nome: " + arroz.nome);
        System.out.println("Preço: " + arroz.preco);
        System.out.println("Total: " + arroz.preco * (1 - arroz.desconto));

        System.out.println("Nome: " + feijao.nome);
        System.out.println("Preço: " + feijao.preco);
        System.out.println("Total: " + feijao.preco * (1 - feijao.desconto));



    }
}
// DESAFIO
// Crie uma classe com os atributos de um livro :
// Titulo, preco, autor, ano de publicacao
// Crie uma classe LivroTeste e acesse os atributos dessa classe atribuindo valores a esses atributos, imprimindo-os no console...