package Ex5;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void som();
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("O gato faz: Miau!");
    }
}

class Pato extends Animal {
    @Override
    public void som() {
        System.out.println("O pato faz: Quack!");
    }
}

public class Ex5 {
    public static void fazerSomDeAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }

    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Cachorro());
        listaDeAnimais.add(new Gato());
        listaDeAnimais.add(new Pato());

        fazerSomDeAnimais(listaDeAnimais);
    }
}

