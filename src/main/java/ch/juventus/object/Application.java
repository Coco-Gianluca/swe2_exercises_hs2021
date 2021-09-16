package ch.juventus.object;

public class Application {

    public static void main(String[] args) {

        Address address = new Address("heimstrasse", 8, 8953, "dietikon");
        Address address1 = new Address("heimstrasse", 8, 8953, "dietikon");

        Person person = new Person();
        person.setFirstName("linda");
        person.setLastName("krueger");
        person.setAddress(address);
        person.setAge(29);
        person.setHasPet(false);

        Person person1 = new Person();
        person1.setFirstName("linda");
        person1.setLastName("krueger");
        person1.setAddress(address1);
        person1.setAge(29);
        person1.setHasPet(false);

        Person person2 = new Person();
        person2.setFirstName("hans");
        person2.setLastName("meier");
        person2.setAddress(address1);
        person2.setAge(29);
        person2.setHasPet(false);

        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));

    }

}
