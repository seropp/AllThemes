package colection.list;

import java.util.*;

// МЕОТДЫ ИНТЕРФЕЙСА LIST
// add()
// addAll()
// get()
// indexOf()
// lastIndexOf()
// listIterator (): возвращает объект ListIterator для обхода элементов списка
// List<E> of(элементы): создает из набора элементов объект List
// remove()
// set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index
// sort(Comparator<? super E> comp): сортирует список с помощью компаратора comp
// subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end

public class ArrayList_Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(5%3);
        intList.add(4);
        intList.add(null);
        intList.add(11);
        intList.add(11);
        if(intList.contains(null)){
            intList.set(intList.indexOf(null), 33);
            intList.removeAll(Arrays.asList(11));
//            intList.retainAll(Arrays.asList());
        }
        intList.forEach(System.out::println);

        System.out.println("=====================");
        List<List<String>> intList2 = new ArrayList<>(4);
        intList2.add(new ArrayList<>(List.of("AAAA","DDDD", "SFWF")));
        intList2.add(new ArrayList<>(List.of("BBBB","FFFF", "WFWWF")));
        intList2.add(new ArrayList<>(List.of("CCCC","GGGG", "WFWF")));
//        Collections.rotate(intList2, -2);
        Collections.shuffle(intList2);
        intList2.forEach(System.out::print);
        System.out.println();
        intList2.forEach(System.out::print);
        System.out.println("___________");
        System.out.println(intList2);
    }
}
