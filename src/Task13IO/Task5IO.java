package Task13IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Task5IO {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("C://Прога//Task2.txt")) {
            for (int i = 0; i < 20; i++) {
                int a = (int) (255 + Math.random() * 100);
                fos.write((a >>> 24) & 0xFF);
                fos.write((a >>> 16) & 0xFF);
                fos.write((a >>> 8) & 0xFF);
                fos.write((a) & 0xFF);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int sum = 0;
        int i = 0;
        int a = 0;
        try (
                FileInputStream fis = new FileInputStream("D://Прога//Task2.txt")) {
            while (fis.available() > 1) {
                int ch1 = fis.read();
                int ch2 = fis.read();
                int ch3 = fis.read();
                int ch4 = fis.read();
                a = (((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4)));
                sum += a;
                i++;
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println(sum / i);
        } catch (
                IOException e)

        {
            System.out.println(e);
        }
    }
}

