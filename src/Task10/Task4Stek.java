package Task10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4Stek {

    private static ArrayList<Integer> array = new ArrayList<>();

    public static void pop() {
        System.out.println(array.get(array.size() - 1));
        array.remove(array.size() - 1);
    }

    public static void push(int a) {
        array.add(0, a);
    }

    public static void stack(int a) {
        array.ensureCapacity(2);
    }

    public static void main(String[] args) {
        stack(2);

        boolean run = true;
        Scanner in = new Scanner(System.in);
        while (run) {
            System.out.print("Input a numbers: ");
            push((Integer.parseInt(in.next())));
            System.out.println("Continue? Y/N:");
            if (in.next().equalsIgnoreCase("N")) {
                run = false;
            }
        }
        System.out.println(array);
        pop();
        System.out.println(array);
    }


}
