package Task9Generics;

public final class PairUtil {
    public static <K,V> Pair<V,K> swap(Pair pair) {
        Pair<V,K> meth= new Pair(pair.getItem2(),pair.getItem1());
        return meth;
        }
}
