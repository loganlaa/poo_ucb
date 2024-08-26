package conversor;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            // Se o usuário escolher celsios -- voce converte oara ceulsius. Se escolher Farenheit, converta para farenheit
            Scanner entrada = new Scanner(System.in);
            double final_temp ;

            System.out.println("Digite a temperatura: ");
            double temperature = entrada.nextDouble();

            System.out.println("Gostaria de converter de Celsius para Farenheit (1) ou de Farenheit par Celsius (2) ?");
            int into = entrada.nextInt();
            if (into == 2) {
                final_temp = (temperature - 32) * 5.0 / 9;
                System.out.println(final_temp);
            }
            if (into == 1) {
                final_temp = (temperature * 9 / 5.0) + 32;
                System.out.println(final_temp);
            }
        }
    }




