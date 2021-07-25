package colection.Comparable_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Comparator<People> comp = new PeopleSexComparator().thenComparing(new PeopleAgeComparator());
        TreeSet<People> treeSet = new TreeSet<People>(comp);
        treeSet.add(new People("Toni", 34, Sex.MAN));
        treeSet.add(new People("Kate", 50, Sex.WOMAN));
        treeSet.add(new People("Din", 42, Sex.MAN));
        treeSet.add(new People("Sofi", 34, Sex.WOMAN));
        treeSet.add(new People("Hanna", 27, Sex.WOMAN));
        treeSet.add(new People("Bill", 60, Sex.MAN));
        treeSet.add(new People("Emmanuel", 20, Sex.MAN));
        treeSet.add(new People("Sergey", 25, Sex.MAN));

        for (People x : treeSet) {
            System.out.printf("NAME: %S, AGE: %d, SEX: %s%n", x.getName(),x.getAge(),x.getSex());
        }


    }
}
enum Sex{
    MAN, WOMAN;
}

class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}

class PeopleSexComparator implements Comparator<People> {

    public int compare(People a, People b){
        if(a.getSex() == b.getSex()) return 0;
        else if((a.getSex() == Sex.MAN) && (b.getSex() == Sex.WOMAN)) return -1;
        return 1;
    }
}
class PeopleAgeComparator implements Comparator<People> {
    public int compare(People a, People b){
        return a.getAge()-b.getAge();
    }
}