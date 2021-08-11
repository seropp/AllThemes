package collection_and_generics.colection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet_Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 1, 2, 2));
        HashSet<Integer> hashSet = new HashSet<>(arrayList);

        System.out.println(hashSet);
    }
}
