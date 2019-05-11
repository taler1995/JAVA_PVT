package Task17Stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class task2UniqueString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("messageses","dsfsdf","messageses","fgfgfgdfgdf","sdfasdasas");
        long count = stringList.
                stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
