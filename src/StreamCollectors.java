import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollectors {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Kate", 23),
                new Person("Sergey", 25),
                new Person("Sam", 55),
                new Person("Hanna", 32));

//        List<Person> newPersonList =
//                personList.stream()
        // .collect(Collectors.averagingDouble(Person::getAge)); средний показатель
        // .collect(Collectors.summarizingDouble(Person::getAge)); суммированный показатель
        // .collect(Collectors.joining(" и ", "В Германии ", " совершеннолетние."));
        // .collect(Collectors.groupingBy(Person::getAge));  Создание Map
        // и другие. Множество функциональных возможностей по статистике и др


        // через Collector.of() создаем свою логику обработки
        /*  Collector<Person, StringJoiner, String> personNameCollector =
                            Collector.of(
                            () -> new StringJoiner(" | "),          // supplier
                            (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                            (j1, j2) -> j1.merge(j2),               // combiner
                            StringJoiner::toString);                // finisher

            String names = persons
                .stream()
                .collect(personNameCollector);

            System.out.println(names);  // ANDREW | IGOR | IRA | VITIA
        */

        double sum = Stream.of(1,2,39)
                .mapToInt(x->x)
                .sum();

        IntSummaryStatistics intSummaryStatistics = Stream.of(1,2,3,45,6)
                .mapToInt(x->x)
                .summaryStatistics();
        System.out.printf("Max number: %d\nMin number: %d\nSum: %d\n",intSummaryStatistics.getMax(),intSummaryStatistics.getMin(),intSummaryStatistics.getSum());
        System.out.println(sum);

        SomeInterface someInterface = x -> System.out.println(x/10);
        someInterface.soSomeMethod(100);
        System.out.println("______________________");
someInterface.someMethod();
        SomeInterface someInterface1 = x-> {
            System.out.println(x/100);

        };
        someInterface1.soSomeMethod(1000);
        PersonCreater personCreater = Person::new;


        Person person = personCreater.newPerson();



        StringJoiner stringJoiner = new StringJoiner("-", "[", "]");
        stringJoiner.add("1");
        stringJoiner.add("6");
        stringJoiner.add("5");
        stringJoiner.add("3");
        stringJoiner.add("2");
        System.out.println(stringJoiner);

        int[][] ints = {{1,2,3,45},{1,2,3,4}};
        int[] x = Arrays.stream(ints)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(x));
        (new Random()).ints()
                .limit(10).forEach(System.out::println);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

@FunctionalInterface
interface SomeInterface{
    default void someMethod(){
        System.out.println("hello there!");
    }

    void soSomeMethod(int x);
}

@FunctionalInterface
interface PersonCreater{
    public Person newPerson();
}