package metodos;

public class MetodosTeste {
    public static void main(String[] args) {

        Metodos m = new Metodos();

        m.soma();
        m.soma(3, 3);
        int k = m.soma2();
        System.out.println(k);
    }

}
