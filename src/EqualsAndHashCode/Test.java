package EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < 15; i++) {
            stringSet.add("string");
        }

        Set<Address> addressSet = new HashSet<>();
        addressSet.add(new Address("Kiev", "Ukraine", "Maximova", 5));
        addressSet.add(new Address("Kiev", "Ukraine", "Maximova", 5));

        System.out.println(stringSet);
        System.out.println(addressSet);
    }
}
