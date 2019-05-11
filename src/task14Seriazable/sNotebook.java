package task14Seriazable;


import java.io.*;

public class sNotebook {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C://Прога//Serial2.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C://Прога//Serial2.txt"));
        Notebook notebook = new Notebook("PC1",8,1000,4,"Any","123");
        oos.writeObject(notebook);
        System.out.println(notebook);
        /*ois.readObject();
        System.out.println(notebook);*/
    }
}
