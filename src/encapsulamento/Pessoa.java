package encapsulamento;

public class Pessoa {

    // ABSTRAÇAO == Obter características reais de algo real como uma representação de código

    // Encapsulamento == Quando queremos esconder (deixar implicito) algo do usuário
    // public == Posso ACESSAR OS METODOS E ATRIBUTOS DE QUALQUER LUGAR DO CÓDIGO (inclusive outras classes dentro do mesmo pacote)
    // private == Posso acessar só dentro da classe **** ( Se chamar ele fora da Classe, vai dar erro! A menos que seja por meio de metodo publico)
    //protected
    private String nome; // Só pode acessar ele aqui... se tentar acessar na PessoaTeste vai dar erro
    public int idade;





    ///////////////////////////////////////////////////
    // Maneira de atribuir e retornar atributos públicos:

    public String getNome() {  // Permite retornar o nome, oq não podia antes já ue eler private
        return nome;
    }

    public void setNome(String nome) {  // Permite atribuir valor a nome (já que ele é PRIVATE)
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        ficarMaisVelho(); // Quando o metodo é privado, você só pode usar ele dentro da Classe, emtão voce bota algum outro metodo para usar/retornar ele
    }


    private int ficarMaisVelho() {  // Pode fazer o mesmo com métodos
        return  this.idade += 10;
    }
}

// ENCAPSULAMENTO
// é um dos pilares da programação orientada a objetos (POO).
// Ele consiste em esconder os detalhes internos de uma classe e fornecer uma interface clara e bem definida para interagir com ela.
// Isso ajuda a proteger os dados e a garantir que eles sejam manipulados de maneira controlada.


//O encapsulamento permite que você restrinja o acesso a certos métodos e atributos de uma classe, tornando-os públicos, protegidos ou privados:

//Públicos: Acessíveis de qualquer lugar
//Protegidos: são acessíveis fora da classe, mas a convenção indica que não devem ser acessados diretamente
//Privados: não devem ser acessados fora da classe