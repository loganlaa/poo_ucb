package encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Lôgan";
        //pessoa.idade = 21;

        //System.out.println("Nome: " + pessoa.nome + " Idade: " + pessoa.idade);

        pessoa.setNome("Lôgan");  // Atribui um valor ao atributo privado nome
        System.out.println(pessoa.getNome());  // Pega o nome (atributo privado) e imprime ele
    }
}
