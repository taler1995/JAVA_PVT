package Task9Generics;

public class Solution1<T extends ClassForGenerics> implements InterfaceForGenerics {
    public static void main(String[] args) {
        Solution1<Stop> example = new Solution1<>();
        example.method();
    }


    private void method() {
        System.out.println("lalala");
    }

    private static class Stop  extends ClassForGenerics implements InterfaceForGenerics {

    }

}
