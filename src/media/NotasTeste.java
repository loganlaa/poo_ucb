package media;

import java.util.Scanner;

public class NotasTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;

        System.out.println("Quantas notas deseja cadastrar? ");
        int len = input.nextInt();

        double[] notas = new double[len];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Insira a %d º nota: ", i + 1);
            notas[i] = input.nextDouble();
        }

        for (double n : notas) {
            soma = soma +n;
        }

        double media = soma/ notas.length;
        System.out.println(media);

    }
}

// PODE CAIR NA PROVA
