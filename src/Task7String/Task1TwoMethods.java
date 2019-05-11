package Task7String;

import java.util.Date;

public class Task1TwoMethods {
    public static void main(String[] args) {
        String str = "Число";
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++) {
           str += i;
        }
        long finish = System.currentTimeMillis();
        long beet = finish - start;
        System.out.println(beet);


        long start2 = System.currentTimeMillis();
        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i<100000; i++) {
            str1 = str1.append(i);
        }
        long finish2 = System.currentTimeMillis();
        long beet2 = finish2 - start2;
        System.out.println(beet2);
    }
}
