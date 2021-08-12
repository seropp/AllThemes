package an_exception.try_with_recourses;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Throwable {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, null, 5);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(23);

        Iterator<Integer> itr = list2.listIterator();
        list2.set(4, 22);
        list2.remove(6);
        list2.add(34);

        while (itr.hasNext()){

            System.out.println(itr.next());
        }
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t;
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//        int[] a = new int[]{1};
//    }
//
    }
}

//class TestOwnException extends Exception{
//    public TestOwnException(String message) {
//        super(message);
//    }
//}
