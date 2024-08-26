package equal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("2" == "3");

        //
        String s1 = "2";
        String s2;

        System.out.println("Digite a s2: ");
        s2 = input.nextLine();
        System.out.println(s1.equals(s2)); // equals() teste se o CONTEÚDO DAS ****STRINGS*** são iguais
        // Sem o equals, ele compara as referencias de memória, não o conteúdo. Aí quase sempre dá errado
        // .trim() ----> ignora os espaços em branco da string

// Crie um programa que vai ler a opção de um usuário em string e vai dizer se ele é aluno ou não

    }
}
