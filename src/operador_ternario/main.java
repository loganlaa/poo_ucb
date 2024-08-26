package operador_ternario;
import javax.swing.*;
import java.util.Scanner;

import javax.swing.*;

public class main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.


            //Scanner entrada = new Scanner(System.in); // definindo variável entrada da classe Scanner do java.util para entrada de dados

            double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média: "));

            String resultado = media >= 7 ? "Aprovado" : "Reprovado";  // Utilizando o OPERADOR TERNÁRIO

            //JOptionPane.showMessageDialog(null, (num1 + num2));

            System.out.println("Status do Aluno: " + resultado);


        }
    }



