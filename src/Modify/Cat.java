package Modify;

public class Cat extends Animal {
     String name;

     public Cat(String name) {
          this.name = name;
     }

     @Override
     public void eat() {
          System.out.println(name+ " is eating");
     }
}
