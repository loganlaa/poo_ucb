package veiculo;

class Veiculo {
    String marca;

    Veiculo(String marca) {
        this.marca = marca;
    }

    void exibirMarca() {
        System.out.println("Marca do veículo: " + marca);
    }
}

class Carro extends Veiculo {
    int numeroPortas;

    Carro(String marca, int numeroPortas) {
        super(marca);  // Chamando / Herdando o consrutor da superclasse
        this.numeroPortas = numeroPortas;
    }

    void exibirDetalhes() {
        exibirMarca();
        System.out.println("Número de Portas: " + numeroPortas);
    }
}


public class Heranca2 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Honda", 4);
        meuCarro.exibirDetalhes();
    }
}

// iMPLEMENTE A CLASSE pESSOA SENDO sUPERcLASSE E A cLASSE pESSOA

