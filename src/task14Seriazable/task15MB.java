package task14Seriazable;

import java.io.*;

public class task15MB {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream buffIn = new BufferedInputStream(new FileInputStream("D://Прога//Serialization.txt"));
        BufferedOutputStream buffOut= new BufferedOutputStream(new FileOutputStream("D://Прога//Searilazion1.txt"));
        FileOutputStream FileOut = new FileOutputStream("D://Прога//Searilazion2.txt");
        FileInputStream FileIn = new FileInputStream("D://Прога//Serialization.txt");
        long start = System.currentTimeMillis();
        try {
            while (buffIn.available()>1) {
                buffOut.write(buffIn.read());
            }
            buffIn.close();
            buffOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        long finish =System.currentTimeMillis();
        long beetween = finish-start;
        System.out.println("Buffered - " + beetween);

        long start1 = System.currentTimeMillis();
        try {
            while (FileIn.available()>1) {
                FileOut.write(FileIn.read());
            }
            FileOut.close();
            FileIn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        long finish1 =System.currentTimeMillis();
        long beetween1 = finish1-start1;
        System.out.println("Not Buffered - " + beetween1);

    }
}