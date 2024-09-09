package arrays;

public class Arrays {
    public static void main(String[] args) {

        double[] notas = new double[4]; // Declarando um array ( é um objeto )
        // Se eu quisesse inicializar o array ====== notas[] = {7.5, }

        // TODO ARRAY EM JAVA É UM OBJETO ============= Pergunta de prova

        notas[0] = 7.5;
        notas[1] = 8.5;
        notas[2] = 9.5;
        notas[3] = 10.5;

        // Usando o for

        //for (int i = 0; i <= notas.length; i++) {
        //    System.out.println(notas[i]);
        //}

        // Existe o ForEach ( que é um for automatizado ) / Já infere o tamanho do array / faz tudo igual à estrutura anterior, mas automatizado (embutido)
        //for (double n : notas) {
        //    System.out.println(n);
        //}

        // Usando o Arrays do java.util
        String nts = java.util.Arrays.toString(notas);  // Converte objeto em uma representação de string ( ele estava double )
        System.out.println(nts);

    }
}
