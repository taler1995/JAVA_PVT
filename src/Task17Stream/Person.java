package Task17Stream;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Person {
        private String firstName;
        private String lastName;
        private int age;

    public Person(String name, String surname, int age) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
    }
}

