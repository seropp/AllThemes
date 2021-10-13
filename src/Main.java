import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static Integer x = 10;
    public static void main(String[] args) {

        // Methods Stream APi


        Collection<String> collection = Arrays.asList("Sam", "Bill", "Dani", "Hanna", "Sergey", "din", "emily");

        // 1. filter() -> Predicate<T>  (T) -> boolean
        List<String> list1 = collection.stream()
                .filter(x -> (x.charAt(0)+"").matches("[A-Z]"))
                .filter(x -> x.length()<=3)
                .collect(Collectors.toList());


        // 2. skip(long n)  limit(long n)
        List<String> list2 = collection.stream()
                .skip(2).limit(2).collect(Collectors.toList());


        // 3.  map() -> Function <T,R>    (T) -> R    :1 выходное значение
        List<Integer> list3 = collection.stream()
                .map(x-> (Integer)x.length())
                .collect(Collectors.toList());


        // 4.flatMap() -> Function   :0 или больше выходных значений
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream) //преобразовываем IntStream<int[]> в IntStream
                .toArray();
//        System.out.println(Arrays.toString(newArr));

        Collection<String> collection1 = Arrays.asList("Sam", "Bill", "Bila", "Hana", "Sergey", "din", "emily");

        // 5. distinct() - удаление дубликатов
        String[] arr1 = collection1.stream()
                .distinct()
                .toArray(String[]::new);
        // если укажем toArray() - то будем получать Object[]


        // 6. peek() -> принимает объект и возвращает тот же объ. с измененным внутр состоянием
        Integer[] aee = new Integer[4];

        aee[0] = 23 ; aee[1] = new Integer(2); aee[2] = new Integer(2);
//        Arrays.stream(aee)
//                .peek(p-> {aee[1] = 111;})
//                .forEach(System.out::println);// 23 111 2

        // 7. sorted()
//        collection1.stream()
//                .sorted(Comparator.<String, String>comparing(a-> String.valueOf(a.charAt(0))).
//                        thenComparing(a -> a.charAt(a.length()-1)))
//                .forEach(System.out::println);
        // Необходимо указывать дженерики!!!  Comparator.<String, String>comparing



        // Терминальные методы

        // 8. min() max() для примитивов и min(Comparator) max(Comparator) для объектов
        int[] ar = {1,2,3,4,5,6,7,8};
        Integer[] or = {1,2,3,4,5,6,7,8,9};

        int max = Arrays.stream(ar).max().getAsInt();
        int min = Arrays.stream(or).min((x,y) -> x-y).get();
        // max() и min() возвращают Optional поэтому необходимо конвертировать это впримитив или объект

        // 9. count() возвращает long. Поэтому присвоить к int или short не возможн => потеря данных
        long count = Arrays.stream(ar).count();

        // 10. find First() -> возвр Optional.
        int firstNum = Arrays.stream(ar)
                .filter(i->i%2==0)  //часто исп в паре с filter()
                .findFirst().getAsInt();

        // 11. allMatch() -> Predicate. Проверка всех элементов на опред условие
        boolean test = Arrays.stream(or)
                .allMatch(i-> i>0&&i<10);

        // 12. anyMatch(). Predicate. Хотя бы 1 элемент соответствует условию
        // 13. noneMatch(). Predicate. Ни одине не соответствует

        // 14. collect() ->
        Map<String, Integer> map = Stream.of("apple", "orange", "lemon", "banana")
                .collect(Collectors.toMap(x-> x, String::length));
        //{orange=6, banana=6, apple=5, lemon=5}


//        IntStream stream = Arrays.stream(ar);
//        stream.allMatch(a->a<10);
//        stream.noneMatch(a->a<10);

        Supplier<IntStream> supplier =()-> Arrays.stream(ar);
        supplier.get().allMatch(a->a<10);
        supplier.get().noneMatch(a->a<10);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        list.subList(3-1,5).clear();
        System.out.println(list);
    }

}