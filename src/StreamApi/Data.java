package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> people = new ArrayList<>();

    static {

        Person person1 = new Person("Alex", "Jackson", 21);
        Person person2 = new Person("Jack", "Stepson", 33);
        Person person3 = new Person("Mike", "Anderson", 41);
        Person person4 = new Person("Alex", "Peterson", 11);
        Person person5 = new Person("Eugeniu", "Samson", 21);
        Person person6 = new Person("Sergiy", "Watson", 21);
        Person person7 = new Person("Alex", "Watson", 25);
        Person person8 = new Person("Alex", "Anderson", 27);
        Person person9 = new Person("Mike", "Jackson", 39);
        Person person10 = new Person("Jack", "Jackson", 44);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

    }

    public static List<Person> getPeople() {
        return people;
    }
}
