package Task8RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z]\\w+@\\w+\\.(com|org)");
        Matcher matcher = pattern.matcher("Utrexxx1@gmail.com");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
