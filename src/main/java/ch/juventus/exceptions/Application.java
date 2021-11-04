package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class Application {

    public static void main(String[] args) {

        PersonRepository personRepo = new PersonRepository();

        try {
            personRepo.findById(42);
        } catch (PersonNotFoundException e) {
            System.out.println("Catch PersonNotFoundException");
            e.printStackTrace();
        }

        personRepo.addPerson(new Person());

//        try {
//            personRepo.addPerson(new Person());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Catch IllegalArgumentException");
//            e.printStackTrace();
//        }

    }

}
