package Task17Stream;

import java.util.Arrays;
import java.util.List;

public class task4Concat {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        String result = list.stream()
                .map(number -> number.toString())
                .reduce("", (base, element) -> base + element);
        System.out.println(result);
    }
}
