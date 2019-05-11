package Task10;

import java.util.ArrayList;

public class Task2GradesMAX {
    public static void main(String[] args) {
        int max = 0;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int rand = (int) (Math.random() * 11);
            marks.add(rand);
        }
        System.out.println(marks);
        for (int buff : marks) {
        if (max < buff) {
            max = buff;
        }
        }
        System.out.println(max);

    }
}
