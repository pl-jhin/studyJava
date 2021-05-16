package sqwpmx;

import java.util.ServiceLoader;

public class main {
    public static void main(String[] args) {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for (Animal animal : animals){
            animal.say();
        }
    }
}
