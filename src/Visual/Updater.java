package Visual;

import Laba2.People;
import Laba2.Person;

import java.util.Map;

/**
 * Created by SlyFox on 26.04.2017.
 */
public class Updater {
    static Map<String, Person> GetAll()
    {
        return People.GetPersons();
    }

    static void Add(Person person)
    {
        People.AddPerson(person);
    }

    static Person GetPerson(String name)
    {
        return People.GetByName(name);
    }

    static void EditPerson(String name, Person newValue)
    {
        People.GetPersons().
    }

    static void EditPersons(Map<String, Person> persons)
    {
        People.GetPersons().clear();
        People.GetPersons().putAll(persons);
    }

    static void AddPerson(Person Value)
    {
        People.AddPerson(Value);
    }

    static void DeletePerson(String name)
    {
       People.GetPersons().remove(name);
    }
}
