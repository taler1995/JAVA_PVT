package Task10;

import java.util.ArrayList;
import java.util.Collections;

public class Task7Sort {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(12);
        array.add(11);
        array.add(-12);
        array.add(0);
        array.add(-5);
        array.add(4);
        array.add(3);
        array.add(-2);
        array.add(-52);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        Collections.reverse(array);
        System.out.println(array);
    }
}
