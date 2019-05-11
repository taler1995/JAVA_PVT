/*package Task13IO;

import java.io.*;
import java.util.ArrayList;

public class Task5Input {
    public static void main(String[] args) throws IOException {
        int sum =0; int i = 0; int a =0;
        try (FileInputStream fis = new FileInputStream("D://Прога//Task2.txt")) {
            while (fis.available() > 1) {
                int ch1 = fis.read();
                int ch2 = fis.read();
                int ch3 = fis.read();
                int ch4 = fis.read();
                a = (((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0)));
                sum += a;
                i++;
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println(sum/i);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}*/

