package heranca4;

class Animal {
    protected String tipo;  // Só é acessível para aqueles que herdam

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    protected void exibirTipo() {
        System.out.println("Tipo de animal: " + tipo);
    }
}

class Gato extends Animal {
    private String nome;  // Só é acessível de dentro da classe

    public Gato(String tipo, String nome) {
        super(tipo);
        this.nome = nome;
    }

    public void exibirDetalhes() {
        super.exibirTipo();
        System.out.println("Nome do gato: " + nome);
    }
}

// Quando é protected, só vai ser acessível ( ou visível ) por outras classes se houver um relacionamento de herança ( TEM QUE ESTAR HERDANDO )!!!!!!!!!!!!!


public class Heranca4 {
    public static void main(String[] args) {

        Gato meuGato = new Gato("Persa", "Gatinhosa");
        meuGato.exibirDetalhes();

    }
}
