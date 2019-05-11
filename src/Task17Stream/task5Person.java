package Task17Stream;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class task5Person {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", "Ferguson", 75),
                new Person("Pep", "Guardiola", 50),
                new Person("Arsen", "Venger", 70));
        new Person("Marchello", "Lipi", 65);

        String name = people.stream()
                .filter(person -> ((person.getFirstName() + person.getLastName()).length()) < 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst().get();
        System.out.println(name);

    }
}

