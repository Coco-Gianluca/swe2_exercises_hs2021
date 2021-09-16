package ch.juventus.object;

import java.util.Objects;

public class Address {

    private final String street;
    private final int number;
    private final int plz;
    private final String city;

    public Address(String street, int number, int plz, String city) {
        this.street = street;
        this.number = number;
        this.plz = plz;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", plz=" + plz +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && plz == address.plz && Objects.equals(street, address.street) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, plz, city);
    }
}
