package Task7String;

public class Task2Smiles {
    public static void main(String[] args) {
        String str = "(((((()))(((()()()()()()(";
        String aa = str.replaceAll("\\(",")");
        System.out.println(aa);
    }
}
