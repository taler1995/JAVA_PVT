package Task11Map;

import java.util.HashSet;
import java.util.List;

public class task4BlackBox {
    public static void main(String[] args) {
        List<Integer> set = (List<Integer>) new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.get(5);
        System.out.println(set);
        findMAX(5);
    }

    private static void findMAX(int number) {

    }
}


