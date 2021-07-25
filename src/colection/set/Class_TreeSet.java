package colection.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Class_TreeSet {
    public static void main(String[] args) {

        TreeSet<String> stringTreeSet = new TreeSet<String>(String::compareToIgnoreCase);
        ArrayList<String> stringArrayList = new ArrayList<String>(List.of("aaaa", "bbbb", "cccc", "B2B"));
        stringTreeSet.addAll(stringArrayList);

        System.out.println(stringArrayList);
        System.out.println(stringTreeSet);
    }
}

