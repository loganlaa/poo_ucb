import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //Scanner entrada = new Scanner(System.in); // definindo variável entrada da classe Scanner do java.util para entrada de dados

        double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média: "));

        String resultado = media >= 7 ? "Aprovado" : "Reprovado";  // Utilizando o OPERADOR TERNÁRIO

        //JOptionPane.showMessageDialog(null, (num1 + num2));

        System.out.println("Status do Aluno");


    }
    }


