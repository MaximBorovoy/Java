package Modify;

public class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

     static class AnotherAnimal extends Animal {
        @Override
        public void eat() {
            System.out.println("Another Animal is eating");
        }
    }



    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
        AnotherAnimal anotherAnimal = new AnotherAnimal();
        anotherAnimal.eat();
    }
}
