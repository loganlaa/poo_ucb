import javax.swing.*;
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

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")); // JOptionPane é para ter a mensagem ser lançada em uma janela
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        JOptionPane.showMessageDialog(parentComponent null, (num1 + num2));
        }
    }


