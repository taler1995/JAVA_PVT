package Task7String;

public class Task3StartFinish {
    public static void main(String[] args) {
        String str = "Привет павпавпловалп привет";
        /*String str1 = "Привет";*/
        int index = str.indexOf(" ");
        String str1 = str.substring(0,index);
        System.out.println(startFinish(str,str1));
    }
    private static boolean startFinish(String str,String str1) {
        boolean a = str.startsWith(str1);
        boolean b = str.endsWith(str1);
        return a && b;
    }
}

