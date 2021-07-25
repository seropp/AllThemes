package colection.Comparable_TreeSet;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Person o) {
//        return name.toUpperCase().compareTo(o.getName().toUpperCase());
//    }

//    @Override
//    public int compareTo(Person o) {
//        return name.length() - o.getName().length();
//    }

    @Override
    public int compareTo(Person o) {
        return -(name.length() - o.getName().length());
    }
}

class Main{
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<Person>();
        people.addAll(List.of(new Person("Sam"),new Person("kate"),new Person("Dinuar"),new Person("Sam")));


        people.forEach(x -> System.out.println(x.getName()));

    }
}
