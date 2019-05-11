package Task8RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<[p].*?>");
        Matcher matcher = pattern.matcher("<p id =\"p1\">  dgfdgdg <p>");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}