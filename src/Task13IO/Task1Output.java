package Task13IO;

import java.io.*;

public class Task1Output {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C://Прога//example.txt"));
        String res = buff.readLine();
        while (res != null) {
            System.out.println(res);
            res = buff.readLine();
        }
        buff.close();
    }
}
