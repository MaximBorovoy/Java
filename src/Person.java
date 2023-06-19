import java.sql.SQLOutput;

public class Person implements Info {
    private int height;
    private int weight;
    private int age;
    private String name;

//    public Person(int height, double weight) {
//        this.height = height;
//        this.weight = weight;
//    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void go() {
        System.out.println("I'm going");
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void speak() {
        System.out.println("Мой рост " + height + "см и вес " + weight + "кг");
    }


    @Override
    public String toString() {
        return name +
                ":высота=" + height +
                ", вес=" + weight +
                ", возраст=" + age +
                '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(name + "'s age is " + this.age);

    }
}
