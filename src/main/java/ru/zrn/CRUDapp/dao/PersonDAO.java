package ru.zrn.CRUDapp.dao;

import org.springframework.stereotype.Component;
import ru.zrn.CRUDapp.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Bertik", 32, "bertik@mail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Derev", 35, "derev@mail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Rusik", 30, "rusik@mail.com"));
    }

    public List<Person> index() {
        return people;
    }
    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null );
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setEmail(updatePerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
