package task14Seriazable;

import java.io.*;

public class sComputer {
    public static void main(String[] args) throws IOException {
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://Прога//Serial2.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://Прога//Serial21.txt"));*/
        Computer computer = new Computer("PC1",8,1000,4);
        Computer computer1 = new Computer("PC2",16,4000,16);
        SerializationUtil.doSerialization(computer,"C://Прога//Serial21.txt");
        SerializationUtil.doSerialization(computer1,"C://Прога//Serial21.txt");
        System.out.println(computer);
        System.out.println(computer1);
        computer1.setVideo("Radeon");
        computer1.setCore(4);
        System.out.println(computer1);
       SerializationUtil.doDeserialization(computer,"C://Прога//Serial21.txt");
        SerializationUtil.doDeserialization(computer1,"C://Прога//Serial21.txt");
        System.out.println(computer);
        System.out.println(computer1);
    }
}
