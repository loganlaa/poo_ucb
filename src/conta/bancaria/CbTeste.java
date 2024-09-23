package conta.bancaria;

public class CbTeste {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Lôgan");
        conta.setNumeroConta(246783);

        conta.depositar(30);
        System.out.println(conta.getSaldo());

        conta.sacar(200);
        System.out.println(conta.getSaldo());
    }
}
