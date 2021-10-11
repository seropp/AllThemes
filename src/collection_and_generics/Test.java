package collection_and_generics;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    private int number;

    public Test(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public int getNumber() {
        return number;
    }
}

class Main {
    public static void main(String[] args) {

        HashSet<Test> tests = new HashSet<>();
        tests.add(new Test(1));
        tests.add(new Test(2));
        tests.add(new Test(3));
        tests.add(new Test(4));
        tests.add(new Test(5));
        tests.add(new Test(6));
        tests.add(new Test(7));


        for (Test x : tests) {
            System.out.println(x.getNumber());
        }

    }
}
