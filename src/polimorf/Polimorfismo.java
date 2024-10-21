package polimorf;

class Animal {
    void som() {
        System.out.println("Animal fez um som");
    }
}

class Cachorro extends Animal {
    @Override
    void som() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    void som() {
        System.out.println("Miau!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.som();

        Animal dog = new Cachorro();
        dog.som();

        Animal cat = new Gato();
        cat.som();
    }
}
