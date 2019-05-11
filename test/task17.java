import Task17Stream.Person;
import org.junit.Test;

import java.sql.SQLException;
import java.util.*;

public class task17 {
    @Test
    public void task1Divided5() throws SQLException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 15, 10, 11, 12, 13);
        Integer integer = numbers.stream()
                .filter(element -> element % 2 != 0)
                .filter(element -> element % 5 == 0)
                .mapToInt(element -> element)
                .sum();
        System.out.println(integer);
    }

    @Test
    public void task2UniqueString() throws SQLException {
        List<String> stringList = Arrays.asList("messageses","dsfsdf","messageses","fgfgfgdfgdf","sdfasdasas");
        long count = stringList.
                stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }

    @Test
    public void task3Map() throws SQLException {
        Map<String, Integer> map = new HashMap<>();
        map.put("fddfdsffs", 25);
        map.put("abc", 10);
        map.put("efg", 30);
        map.put("efgdfsgsdgdfsg", 20);
        map.put("efsdfgdfsgsdfg", 10);

        int sum = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }

    @Test
    public void task4Concat() throws SQLException {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        String result = list.stream()
                .map(Object::toString)
                .reduce("", (base, element) -> base + element);
        System.out.println(result);
    }

    @Test
    public void task5Person() throws SQLException {
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
