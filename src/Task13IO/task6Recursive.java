package Task13IO;

import java.io.File;

public class task6Recursive {
    public static void main(String[] args) {
        File dir1 = new File("C://Прога//Recursive");
        System.out.println(dir1.exists());
        System.out.println(dir1.getAbsolutePath());
        recurs(dir1);
        String[] a;
        a = dir1.list();
        System.out.println(a);
    }

    public static void recurs(File dir1) {
        if (dir1.isDirectory()) {
            for (File item : dir1.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "- folder");
                } else {
                    System.out.println(item.getName() + "- file");
                }
                recurs(item);
            }
        }
    }
}
