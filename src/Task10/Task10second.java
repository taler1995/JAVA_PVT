package Task10;

import java.util.ArrayList;

public class Task10second {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        array.add(12 );
        array.add(11);
        array.add(-12);
        array.add(0);
        array.add(-5);
        array.add(4);
        array.add(3);
        array.add(-2);
        array.add(-52);
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j<array.size();j++)
            if (array.get(i) > array.get(j)) {
                int temp =array.get(i);
                array.set(i,array.get(j));
                array.set(j,temp);
            }
        }
        System.out.println(array);
    }
}
