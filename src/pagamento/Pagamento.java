package pagamento;


//Cada uma dessas classes deve implementar o metodo
//processarPagamento de forma específica:
//        • CartaoCredito: simula a verificação de saldo no cartão e a
//aprovação da transação.
//• PayPal: simula a autenticação do usuário e a verificação da
//conta PayPal.
//        • BoletoBancario: simula a geração de um boleto com uma
//data de vencimento.
//• BoletoBancario: simula a geração de um boleto com uma
//data de vencimento.


//3. Crie uma classe principal (Main):
//        • Nesta classe, você vai instanciar diferentes tipos de pagamento
//        (CartaoCredito, PayPal, e BoletoBancario).
//        • Use um array de objetos Pagamento[] para armazenar
//diferentes tipos de pagamento e, em seguida, use um laço for
//para processar cada pagamento chamando o metodo
//processarPagamento.

public abstract class Pagamento {

    public abstract void processarPagamento(Double valor);
}

class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento(Double valor) {

    }


class PayPal extends Pagamento {

    @Override
    public void processarPagamento(Double valor) {

    }
}

class BoletoBancario extends Pagamento  {

    @Override
    public void processarPagamento(Double valor) {

    }
}

}
