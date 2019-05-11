package task14Seriazable;

import java.io.*;

public class SerializationUtil {
    public static void doSerialization(final Object computer, String fileName) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(computer);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File didn't created");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred during serialization");
            e.printStackTrace();
        }
    }

    public static Object doDeserialization(Computer computer1, String fileName) {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File didn't created");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred during deserialization");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error occurred during deserialization");
            e.printStackTrace();
        }
        return null;
    }
}
