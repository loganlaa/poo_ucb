package ex4;

import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibirInformacoes();
}

class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro");
        System.out.println();
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
    }
}

class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Moto");
        System.out.println();
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
    }
}

class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
        }
    }
}


public class exec4 {
    public static void main(String[] args) {

    }
}
