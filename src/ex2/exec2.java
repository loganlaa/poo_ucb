package ex2;

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + salario);

    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
}

public class exec2 {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Rodrigo", 29, 2500, "Desenvolvedor");
        f1.exibirDados();
        System.out.println(f1.calcularSalarioAnual());



    }
}
