package colection.set;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Interface_SortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<Integer>(List.of(1, 2, 3, 4, 5, 6, 7,7,7));
        System.out.println(sortedSet);

        SortedSet<Integer> treeSet = sortedSet.headSet(4);
        System.out.println(treeSet);

        SortedSet<Integer> treeSet2 = sortedSet.subSet(2, 5);
        System.out.println(treeSet2);

        SortedSet<Integer> treeSet1 = sortedSet.tailSet(4);
        System.out.println(treeSet1);
    }
}
