package EqualsAndHashCode;

import java.util.Objects;

public class Address {
    private String city;
    private String country;
    private String street;
    private int houseNumber;


    public Address(String city, String country, String street, int houseNumber) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber && Objects.equals(city, address.city) && Objects.equals(country, address.country) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, street, houseNumber);
    }
}
