package Task7String;

import java.util.Scanner;

public class Task7Zeros {

    public static void main(String[] args) {
        long start;
        long finish;
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
        getString1(i);
        getString2(i);
        getString3(i);
        start = System.nanoTime();
        getString4(i);
        finish = System.nanoTime();
        System.out.println((finish - start));
    }

    static String getString1(int i) {
        long start = System.nanoTime();
        String str = "" + i;
        if (str.length() > 7) {
            str = "0000000";
        } else {
            while (str.length() != 7) {
                str = "0".concat(str);
            }
        }
        long finish = System.nanoTime();
        System.out.println((finish - start));
        return str;
    }

    static String getString2(int i) {
        long start = System.nanoTime();
        String str = "" + i;
        if (str.length() > 7) {
            str = "0000000";
        } else {
            while (str.length() != 7) {
                str = "0" + str;
            }
        }
        long finish = System.nanoTime();
        System.out.println((finish - start));
        return str;
    }

    private static void getString3(int i) {
        long start = System.nanoTime();
        StringBuilder str = new StringBuilder();
        str = str.append(i);
        if (str.length() > 7) {
            str.setLength(0);
            str.append("0000000");

        } else {
            while (str.length() != 7) {
                str.insert(0, "0");
            }
        }
        long finish = System.nanoTime();
        System.out.println((finish - start));
    }

    private static String getString4(int i) {
        return String.format("%07d", i);
    }
}
