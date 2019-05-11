package Task10;

import java.util.ArrayList;
import java.util.Collections;


public class Task3Reverse {
    public static void main(String[] args) {
        String temp;
        ArrayList<String> pupils = new ArrayList<>(10);
        pupils.add("Ivan");
        pupils.add("Victoria");
        pupils.add("Stepan");
        pupils.add("Petr");
        pupils.add("Liza");
        pupils.add("Svetlana");
        pupils.add("Lev");
        pupils.add("Tanya");
        System.out.println(pupils);
        int size = pupils.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            temp = pupils.get(i);
            pupils.set(i, pupils.get(size-1));
            pupils.set(size-1, temp);
            size--;
        }
        System.out.println(pupils);
        Collections.reverse(pupils);
        System.out.println(pupils);
    }
}
