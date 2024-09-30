package heranca;

class Animal {
    void comer() {
        System.out.println("Este animal está comendo");
    }
    // Herança == Tem superclasse e subclasse
    // A subclasse pode herdar atributos da superclasse
    // É para evitar repetir estruturas, gastando menos linhas de código
}

class Cachorro extends Animal{  // Usando "extends", esta classe vira uma subclasse ( ou classe derivada) da superclasse Animal e pode herdar seus atributos e métodos
    void latir() {
        System.out.println("O cachorro está latindo");
    }
}

public class Heranca {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.latir();
    }


}