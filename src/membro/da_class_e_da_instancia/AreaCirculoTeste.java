package membro.da_class_e_da_instancia;

public class AreaCirculoTeste {
    public static void main(String[] args) {

        AreaCirculo ac = new AreaCirculo();
        ac.raio = 5;

        //double area = AreaCirculo.PI * (ac.raio * ac.raio);  // AreaCirculo porque pi é uma variável da Classe, nao da Instancia
        //System.out.println(area);

//        double area = ac.area();  // É um metodo de instância, por isso tá como ac.X
//        double soma = AreaCirculo.somar(); // É um metodo da Classe, por isso está com AreaCirculo
//        System.out.println(area);
//        System.out.println(soma);

        double res = Math.pow(ac.raio, 2) * Math.PI;  // Usando a Classe Math e o metodo pow ( para calcular potência ) e a constante Pi, que é um atributo da Classe e não da Instância
        System.out.println(res);

        // Os atributos e metodos podem ser da instância (objeto) ou da Classe.
    }
}
