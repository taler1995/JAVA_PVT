package Task10;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 5, 8, 9};
        Integer[] arr2 = {4, 5, 6, 10, 2, 1, 11};
        ArrayList array1 = new ArrayList(Arrays.asList(arr1));
        ArrayList array2 = new ArrayList(Arrays.asList(arr2));
        System.out.println(array1);
        System.out.println(array2);
        Union.union(array1, array2);
        Union.intersec(array1,array2);
            }
}

