package class_and_methods;

public class Pessoa { // Dentro dessas chaves tem o corpo/escopo da classe
    // Dentro temos Atributos (características que abstraem o mundo real)
    String nome;
    int idade;
    int peso;
    final double altura = 1.82;  // Tem que inicializar a constante, senão dá erro de compilação (nao precisa nem executar para saber que tem erro)

    void imprimirInfo(){  // Não retorna nada (void) e não tem parâmetros ()
        System.out.println("Nome: " + nome + " idade: " + idade + " peso: " +  peso + " Altura: " + altura);
    }

    // Nome de Classe usa PascalCase

    int fazerAniversario(){
        return idade++;
    }
}
