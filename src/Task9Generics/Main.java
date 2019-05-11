package Task9Generics;

public class Main {
    public static void main(String[] args) {
        Pair e = new Pair<>(523.254,"fdfdsgfs");
        Pair e1 = PairUtil.swap(e);
        System.out.println(e1.getItem1() + " " + e1.getItem2());
        ArifmeticalOperations<Integer> newest = new ArifmeticalOperations<>( 15,5);
        System.out.println(newest.summ());
        System.out.println(newest.divide());
        System.out.println(newest.multiply());
        System.out.println(newest.substract());
        }
}
