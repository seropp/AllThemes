import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
