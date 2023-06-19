package Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Person vasyl = new Person("Vasyl", "vasyl@gmail.com");
        String email = vasyl.getEmail()
                .map(String::toLowerCase)
                .orElse("Vasyl doesn't have an email");

        System.out.println(email);


//        if (vasyl.getEmail().isPresent()){
//            String email = vasyl.getEmail().get();
//            System.out.println(email.toLowerCase());
//        }
//        else System.out.println("Vasyl doesn't have an email again");
    }

}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
