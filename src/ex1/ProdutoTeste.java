package ex1;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Arroz");
        p1.setPreco(42.99);
        p1.setQuantidadeEstoque(32);

        System.out.println(p1.getNome() + p1.getPreco() + p1.getQuantidadeEstoque());
        p1.aplicarDesconto(32);
        System.out.println(p1.getPreco());


    }
}
