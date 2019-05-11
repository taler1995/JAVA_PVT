package Task17Stream;

import java.util.HashMap;
import java.util.Map;

public class task3Map {
    public static void main(String[] args) {
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
}
