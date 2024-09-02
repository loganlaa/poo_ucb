package produto.practice;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto arroz = new Produto(); // Instanciei a classe
        arroz.nome = "Tio João";  // Atribuindo valor
        arroz.preco = 50;
        arroz.desconto = 0.10;

        var feijao = new Produto();  // Isso é inferencia de dados (printf também entra nessa)
        feijao.nome = "Valdemar";  // Atribuindo valor
        feijao.preco = 50;
        feijao.desconto = 0.40;

        System.out.println("Arroz");

        //System.out.println("Nome: " + arroz.nome);
        //System.out.println("Preço: " + arroz.preco);
        //System.out.println("Total: " + arroz.preco * (1 - arroz.desconto));

        //System.out.println("Feijão");

        //System.out.println("Nome: " + feijao.nome);
        //System.out.println("Preço: " + feijao.preco);
        //System.out.println("Total: " + feijao.preco * (1 - feijao.desconto));

        double total = (feijao.preco * (1 - feijao.desconto)) +  (arroz.preco * (1 - arroz.desconto));

        System.out.println("Valor total: " + total);

        System.out.println("Será aplicado desconto da Gerência? (1) Sim   (2) Não");

        int into = input.nextInt();
        if (into == 1) {
            System.out.println("Quanto será o desconto?");
            int desc = entrada.nextDouble();
            System.out.println("Valor FInal = " + total * arroz.descGerencia());
        }
        if (into == 2) {
            final_temp = (temperature * 9 / 5.0) + 32;
            System.out.println(final_temp);
        }
    }
}








    }
}
// os membros referem-se aos elementos que compõem uma classe