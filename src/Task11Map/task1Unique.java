package Task11Map;

import java.util.Map;
import java.util.TreeMap;

public class task1Unique {
    public static void main(String[] args) {
        int k = 0;
        Integer[] array = {15, 15, 5, 123, 123, -5, -5, 4, 4, 8};
        Map<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (map.size() == 0) {
                System.out.println(0);
            }
            System.out.print(e.getKey() + " ");
            k++;
        }
        System.out.println(" ");
        System.out.println(k);
    }

}

