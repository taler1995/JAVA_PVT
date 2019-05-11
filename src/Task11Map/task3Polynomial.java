package Task11Map;


import org.omg.CORBA.INTERNAL;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class task3Polynomial {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new TreeMap<>(/*Collections.reverseOrder()*/);
        Map<Integer, Integer> map2 = new TreeMap<>(/*Collections.reverseOrder()*/);
        Map<Integer, Integer> map3 = new TreeMap<>(Collections.reverseOrder());
        map1.put(1, 2);
        map1.put(3, 3);
        map1.put(7, 4);
        map1.put(6, 5);
        map1.put(5, 6);
        map1.put(8, 7);
        map2.put(0, 2);
        map2.put(8, 3);
        map2.put(5, 4);
        map2.put(2, 5);
        map2.put(3, 6);
        map2.put(4, 7);
        map2.put(17,8);
        System.out.println(map1);
        System.out.println(map2);
        for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
            System.out.print("+" + e.getValue() + "x^" + e.getKey());
        }
        System.out.println(" ");
        for (Map.Entry<Integer, Integer> t : map2.entrySet()) {
            System.out.print("+" + t.getValue() + "x^" + t.getKey());
        }
        System.out.println(" ");
        for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
            for (Map.Entry<Integer, Integer> t : map2.entrySet()) {
                if (e.getKey() == t.getKey()) {
                    int a = e.getValue() + t.getValue();
                    map3.put(e.getKey(), a);
                    System.out.println(e);
                } else if (t.getKey() != e.getKey()) {
                    map3.put(t.getKey(), t.getValue());
                    map3.put(e.getKey(), e.getValue());
                }
            }
        }
        System.out.println(map3);
        for (Map.Entry<Integer, Integer> t : map3.entrySet()) {
            String s = "+" + t.getValue() + "x^" + t.getKey();
            /*s = s.replaceFirst("^.","");*/
            s = s.replaceAll("x\\^0","");
            System.out.print(s);

        }
    }
}
