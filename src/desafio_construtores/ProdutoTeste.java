package desafio_construtores;

public class ProdutoTeste {
    public static void main(String[] args) {
        var produto1 = new ProdutoClasse("Arroz Tio João", 32.50);  // Insatnciei através do construtor personalizado
        var produto2 = new ProdutoClasse();  // Instanciei a classe a partir do construtor vazio

        produto2.nome = "Cavalo";
        produto2.preco = 65.90;

        System.out.println(produto1.nome);
        System.out.println(produto1.preco);
        System.out.println(produto2.nome);
        System.out.println(produto2.preco);

        // Construtores criam objetos ( através do Construtor que a Classe é instanciada )
        // Quando você cria uma instância de uma classe (ou seja, quando usa o operador new), o construtor é chamado automaticamente.
    }
}
// Questao da prova:
// O construtor padrão, mesmo que declarado um construtor personalizado, ele ainda existe? Não. Tem que declarar de novo o construtor vazio.
