package produto.practice;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double descGerencia() {
        return (1 - descontoGerencia);
    }
}
