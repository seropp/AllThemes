package collection_and_generics.colection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Test {
    public static void main(String[] args) {
        LinkedList<Integer> stringList = new LinkedList<Integer>(List.of(1, 2,3 ,4 ,5 ,6, 7, 8, 9,10));

        // addFirst() / offerFirst(): добавляет элемент в начало списка
        // addLast() / offerLast(): добавляет элемент в конец списка
        stringList.addLast(3);
        stringList.offerLast(3);
        stringList.addFirst(34);
        System.out.println(stringList);

        //removeFirst() / pollFirst(): удаляет первый элемент из начала списка
        stringList.pollLast();
        stringList.pollLast();
        stringList.pollLast();
        System.out.println(stringList);

        //getFirst() / peekFirst(): получает первый элемент
        //getLast() / peekLast(): получает последний элемент
        System.out.println(stringList.getFirst());
        //

        //

        //


    }
}
