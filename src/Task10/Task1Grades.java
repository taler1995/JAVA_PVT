package Task10;

import java.util.ArrayList;
// Есть способ с итератором;
public class Task1Grades {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(10);
        for (int i = 0; i < 11; i++) {
            int rand = (int) (Math.random() * 10);
            marks.add(rand);
        }
        System.out.println(marks);
        ArrayList<Integer> negativemarks = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int a = marks.get(i);
            if (a < 4) {
                negativemarks.add(a);
            }
        }
        System.out.println(negativemarks);
        marks.removeAll(negativemarks);
        System.out.println(marks);
    }
}
