package StreamApi;

import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        List<Person> personList = Data.getPeople();

        List<Person> persons = personList.stream()
                .map(person -> new Person(person.getFirstName(), person.getLastName(), 15)).toList();

        persons.forEach(p -> System.out.println(p));

        System.out.println("/////");

        Optional<Person> person = personList.stream()
                .filter(p -> p.getAge() > 25)
                .findAny();
        System.out.println(person.get());
    }
}
