package Task13IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class task7 {
    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new FileReader("C://Прога//Task7.txt"));
        ArrayList sus = new ArrayList();
        String res = buff.readLine();
        while (res != null) {
            sus.add(res);
            /*System.out.println(res);*/
            res = buff.readLine();
        }
        Collections.reverse(sus);
        for (int i = 0; i < sus.size()-1;i++) {
        System.out.println(sus.get(i));}
        buff.close();



    }
}
