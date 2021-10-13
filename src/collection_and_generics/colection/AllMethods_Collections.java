package collection_and_generics.colection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllMethods_Collections<T> {
    public static void main(String[] args) {
        int[] arr = {34341,434,34,33,423,4,235,25,25,46,7,845,36,24,65,357,5,887,88,9,85,4,654,63,4,23,43,4,5,4,37,547,46,8,7,546,56,3,46,46,7,46,84,4,56,546,4,54,342,90,8908,7,96,79,57,5,764,76,587,5,95,6,4, 2, 3, 4, 5, 6, 7, 8, 9};

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
        // Collections.
        //
        // rotate(list, dist); Перестановка символов на дистанцию dist
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
//        System.out.println(Arrays.toString(sort(arr)));
    }
     public static int[] sort(int[]  arr) throws IOException {

        int n = arr.length;

         for (int interval = n/2 ; interval > 0; interval /= 2) {
             for (int i = interval; i < n; i++) {
                 System.out.println("A теперь зашли в for 2   i = " +i+"  interv "+ interval);
                 System.out.println();
                 int key = arr[i];
                 int j = i;
                 while (j>=interval && key<arr[j-interval]){
                     System.out.println("КРУТИМ WHILE c шагом в "+interval+"   a j = "+j);
                     System.out.println(j-interval);
                     arr[j] = arr[j-interval];
                    j -= interval;
                 }
                 arr[j] = key;
             }
         }
         List<String> list = new ArrayList<>();
            Stream<String> stream = Files.lines(Paths.get(""));
            Stream<String> stringStream = Arrays.stream("Aasdw".split(""));
         IntStream stream1 = "24240".chars();
         Stream<Integer> stream2 = Stream.builder().add(1).add(2).add(3).build().map(x-> (Integer)x);
         Stream<String> stringStream1 = list.parallelStream();
         Stream<Integer> stream3 = Stream.iterate(1, x-> x++);
         Stream<Integer> stream4 = Stream.generate(()-> 1);
        return arr;
    }
}