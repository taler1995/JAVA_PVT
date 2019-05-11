package Task13IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3SameLastAndFirstNext {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C://Прога//Task2.txt"));
        String res = buff.readLine();
        Pattern pattern = Pattern.compile("\\w+([a-zA-z])\\b\\s\\b\\1\\w+");
        while (res != null) {
            Matcher matcher = pattern.matcher(res);
            res=buff.readLine();
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        buff.close();
    }
    }

