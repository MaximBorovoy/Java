package Modify;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog("Dog");
        Animal animal1 = new Cat("Cat");
        Animal animal2 = new Animal();
        Cat cat = new Cat("Catty");
        Dog dog = new Dog("Puppy");
//        test(animal);
//        test(animal1);
//        test(animal2);
//        System.out.println();
//        test(cat);
//        test(dog);
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Dog("Dog"));
        animalsList.add(new Cat("Cat"));
        animalsList.add(new Dog("Chita"));
        animalsList.add(3, new Dog("Cat"));
        showAnimals(animalsList);
    }

    public static void showAnimals(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
