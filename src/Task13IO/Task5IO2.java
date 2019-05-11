package Task13IO;

import java.io.*;
import java.lang.reflect.Array;

public class Task5IO2 {
    public static void main(String[] args) throws IOException {
        /*Writer buff =new FileWriter("D://Прога//Task3.txt");
        for (int i = 0; i < 20; i++) {
            int num = (int) (255 + Math.random() * 550);
            buff.write(num + " ");
        }
        buff.close();
    }*/
/*int[] array = new int[10];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt();

        try (final FileWriter writer = new FileWriter("D://Прога//Task2.txt", false)) {
            for (int i = 0; i < array.length; ++i) {
                final String s = Integer.toString(array[i]);
                writer.write(s + " ");
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
        int[] array = {15, 15, 15, 885, 456, 8, 1235, 45, 256};
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C://Прога//LetTRY.txt"));
        for (int i = 0; i < array.length; i++) {
            dos.writeInt(array[i]);
        }

        DataInputStream sod = new DataInputStream(new FileInputStream("C://Прога//LetTRY.txt"));
        for (int i =0;i<array.length;i++) {
            System.out.println(sod.readInt());
        }
    }
}