package Task13IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C://Прога//Task4.txt"));
        long max = 0;
        long aaa;
        String res = buff.readLine();
        Pattern pattern = Pattern.compile("\\d+");
        while (res != null) {
            Matcher matcher = pattern.matcher(res);
            res = buff.readLine();
            while (matcher.find()) {
                if (max < Long.parseLong(matcher.group())) {
                    max = Long.parseLong(matcher.group());
                }
                /* System.out.println(matcher.group());*/
            }
            System.out.println(max);
            max = 0;
        }
        buff.close();
    }
}
