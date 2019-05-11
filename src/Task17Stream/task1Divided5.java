package Task17Stream;

import java.util.Arrays;
import java.util.List;

public class task1Divided5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 15, 10, 11, 12, 13);
        Integer integer = numbers.stream()
                .filter(element -> element % 2 != 0)
                .filter(element -> element % 5 == 0)
                .mapToInt(element -> element)
                .sum();
        System.out.println(integer);
    }
}
