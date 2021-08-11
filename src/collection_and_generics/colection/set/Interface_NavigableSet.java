package collection_and_generics.colection.set;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Interface_NavigableSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2 ,3, 4, 5,5,53));
        NavigableSet<Integer> nav1 = new TreeSet<>(list);
        NavigableSet<Integer> nav2 = nav1.descendingSet();

        System.out.println(nav1);
        System.out.println(nav2);
    }
}
