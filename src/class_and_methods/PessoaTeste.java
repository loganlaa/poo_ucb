package class_and_methods;

public class PessoaTeste {
    public static void main(String[] args) {
        // Instanciar uma Classe == Falar que sua variável é do tipo da sua classe
        Pessoa p1 = new Pessoa();

        p1.nome = "Lôgan Alvim"; // Está acessando o atributo nome da Classe Pessoa através do Ponto ( Através do Ponto acessamos os membros da Classe, seja métodos ou atributos )
        p1.idade = 21;
        p1.peso = 85;

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.peso);
        System.out.println(p1.altura);

    }

}
