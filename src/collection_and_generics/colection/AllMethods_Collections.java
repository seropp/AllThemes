package collection_and_generics.colection;

import java.util.*;
import java.util.stream.Collectors;

public class AllMethods_Collections {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr1 = (new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))).stream()
                .mapToInt(x -> (int)x)
                .toArray();
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        Integer[] arrInteger = list.toArray(Integer[]::new);

        // Collections.frequency(col, "A");  Поиск колличества совпадений
        // Collections.sort(col); Сортировка коллкеции
        // Collections.copy(list1, list2); Копирует list2 в list1 при этом list2.size()<=list1.size()
        // Collections.shuffle(list); Перемешивает элементы в коллекции
        // List list = Collections.EMPTY_LIST;
        // Collections.rotate(list, dist); Перестановка символов на дистанцию dist
        // Collections.binarySearch(list, "A"); Возвращает первое вхождение эл
        // Collections.disjoint(Collection a, Collection b);  Проверяет есть ли хотя бы 1 общий элемент
        // Collections.fill(list,"S"); заполняет List объектом
        // Collections.max(); max - коллекции
        // Collections.min(); min - колекции
        // Collections.reverse(); void переворот List
        // Collections.swap(); Меняет 2 элемента местами
        // Collections.synchronizedCollection(); Синхронизирует кол
        // Collections.unmodifiableCollection(); Делает неизменяемой



        // 1. List<Integer> list11 =new ArrayList<Integer>(){{add(1); add(1);}};
        // 2. List<Integer> list22 = Arrays.asList(1, 2, 3);  неизменяемый
        // 3. List<Integer> list33 = new ArrayList<>(Arrays.asList(1,2,3,4));  изменяемый
        //
        // 4. List<Integer> list44 = new ArrayList<Integer>();
        //    Collections.addAll(list44, 1, 2, 3, 4);
        // 5. List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        // 6. List<Integer> list = Collections.singletonList(2);
        //    возвращает неизменный список, состоящий только из одного элемента.
        // 7. List<Integer> list = Stream.of(1, 2, 3)
        //                        .collect(Collectors.toCollection(ArrayList::new)

    }
}
