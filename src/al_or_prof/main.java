package al_or_prof;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        String[] professores = {
                "Victor",
                "Adriana",
                "Weldes",
                "Santana"
        };

        for (String professor : professores) {
            if (nome.equalsIgnoreCase(professor)) {
                System.out.println("É professor!");
                break;
            } else {
                System.out.println("É Aluno!");
                break;
            }
        }
    }
}
