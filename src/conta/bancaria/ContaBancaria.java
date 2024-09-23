package conta.bancaria;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo = 50;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {

        if (valor >= 0) {
            return this.saldo += valor;
        }
        else {
            System.out.println("Valor Negativo!");
            return getSaldo();
        }

    }

    public double sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            return this.saldo -= valor;
        }
        else {
            System.out.println("Não há saldo suficiente!");
            return getSaldo();
        }
    }
}

