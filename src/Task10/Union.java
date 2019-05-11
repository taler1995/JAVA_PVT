package Task10;

import java.util.ArrayList;
import java.util.Collections;

public class Union {

    public static void union(ArrayList array1, ArrayList array2) {
        ArrayList buffer = new ArrayList();
        buffer.addAll(array1);
        buffer.removeAll(array2);
        buffer.addAll(array2);
        Collections.sort(buffer);
        System.out.println(buffer);
    }

    public static void intersec(ArrayList array1, ArrayList array2) {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    temp.add(array1.get(i));
                }
            }
        }
        System.out.println(temp);
    }

}
