package Task8RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("0x[0-9A-F]{4}");
        Matcher matcher = pattern.matcher("0xFFFF пкп ывапап0x0012 ло прлп0xABC5");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

