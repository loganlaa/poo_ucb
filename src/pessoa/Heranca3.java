package pessoa;

class Pessoa {
    String nome;

    Pessoa (String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.println("Nome: " + nome);
    }


}

class Estudante extends Pessoa {
    String escola;

    Estudante (String nome, String escola) {
        super(nome);
        this.escola = escola;
    }

    void exibirDetalhes() {
        super.exibirNome(); // ou só exibirNome();
        System.out.println("Nome da Escola: " + escola);
    }

}





public class Heranca3 {
    public static void main(String[] args) {

        Estudante pessoa1 = new Estudante("Lôgan", "EPCAR");

        pessoa1.exibirDetalhes();
    }
}
//
//O construtor da classe Estudante é chamado. Dentro deste construtor, super(nome) chama o construtor da classe Pessoa e passa o parâmetro nome para ele. Isso inicializa o campo nome na classe Pessoa. Depois disso, o campo escola é inicializado na classe Estudante.

//Isso garante que a parte da classe pai (Pessoa) seja corretamente inicializada antes de adicionar a funcionalidade específica da classe filha (Estudante).
