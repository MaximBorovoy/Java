package Overloading;


public class OverloadingExample {
void method(Parent p){
    System.out.println("parent");
}
void method(Child c){
    System.out.println("child");
}

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.method(null);

    }
}

class Parent{

}

class Child extends Parent {

}
