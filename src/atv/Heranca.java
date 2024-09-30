package atv;

class Pessoa {
    protected String nome;
    protected int idade;

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getIdade() {
        return idade;
    }

    // Construtor
    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    protected void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade()  + " anos");
    }
}

class Aluno extends Pessoa {
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Matrícula: " + matricula);
        }
    }

class Professor extends Pessoa {
    private double salario;

    // Construtor
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Salário: R$" + salario);
    }
}

public class Heranca {
    public static void main(String[] args) {

        System.out.println("Pessoa");
        Pessoa p1 = new Pessoa("Robson", 42);
        p1.exibirInfo();

        System.out.println();

        System.out.println("Aluno");
        Aluno a1 = new Aluno("Logan", 21, "UC24100334");
        a1.exibirInfo();

        System.out.println();

        System.out.println("Professor");
        Professor p2 = new Professor("Victor", 35, 3000);
        p2.exibirInfo();


    }
}
