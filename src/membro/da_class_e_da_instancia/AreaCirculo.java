package membro.da_class_e_da_instancia;

public class AreaCirculo {
    double raio;
    final static double PI = 3.1415; // static indica que essa variável é membro da classe ( não da instância, porque eu nao preciso instanciar a classe para ter acesso a esse membro)
    // Ainda dá para mudar se for só static, se quiser que seja constante, precisa colocar o final no início normal


    double area(){
        return PI * (raio * raio);
    }

    static int somar() {
        return 2 + 2;
    }
}
