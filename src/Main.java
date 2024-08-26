import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int n1 = 10;
        double n2 = 10;
        String nome = "Logan";
        Scanner entrada = new Scanner(System.in); // definindo variável entrada da classe Scanner do java.util para entrada de dados


        System.out.println("Digite seu nome: ");
        String nome2= entrada.nextLine(); // define a string nome2 que será definida pela variavel entrada. é específo para string por causa do nextLine()
        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("Nome: %s, Peso: %.1f, idade: %d",nome2,peso, idade);

        }
    }
