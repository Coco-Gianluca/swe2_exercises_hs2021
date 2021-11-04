package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {

    public Person findById(int id) throws PersonNotFoundException {
        throw new PersonNotFoundException("Could not find person with id " + id);
    }

    public void addPerson(Person person) {
        throw new IllegalArgumentException("Invalid person");
    }

}
