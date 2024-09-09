package construtores;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    // Construtor serve para eu ter, já na instanciação, os valores
    // Posso criar quantos construtores eu quiser, para receber diferentes valores


    public Pessoa() {  // É um construtor vazio
    }

    public Pessoa(double peso, int idade) { // Construtor em que a assinatura contém apenas parâmetros
        this.peso = peso;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, double peso) { // Definí um construtor diferente do default
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;// this é para dizer que esse variável nome e da classe ( a definida na classe )
    }
    // (String nome, int idade, double peso) === Chama "Assinatura"


}
