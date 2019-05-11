package Task8RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\+375(29|33|25|44)\\d{7}");
        Matcher matcher = pattern.matcher("+375291464296ававы +375448985855");
        while (matcher.find()) {
            String s = matcher.group();
            System.out.println(s.replaceAll("(375)(29|33|25|44)(\\d{3})(\\d{2})(\\d{2})","$1($2)$3-$4-$5"));
        }
    }
}
