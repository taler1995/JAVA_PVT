package Task8RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{2}?|\\d?)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{2}?|\\d?)){3}");
        Matcher matcher = pattern.matcher("225.225.255.255  172.20.0.15  0.0.0.000");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
