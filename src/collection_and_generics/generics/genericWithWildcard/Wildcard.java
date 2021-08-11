package collection_and_generics.generics.genericWithWildcard;

import java.util.*;


public class Wildcard {
    public static void main(String[] args) {

        // 1. Любой экз интерфейса Collection независимо от типа
        Collection<?> coll1 = new ArrayList<Date>();        // ArrayList - Date
        // или
        Collection<?> coll2 = new LinkedHashSet<String>();  // LinkedHashSet - String


        // 2. Список, который содержит только Number или subclass Number
        List<? extends Number> list1 = new ArrayList<Long>();   // Long - подвид Number
    //  List<? extends Number> list2 = new ArrayList<String>(); // Ошибка!!! String не Number и не подкласс

        // 3. List является родительским видом ArrayList
        LinkedHashSet<? extends List> link1 = new LinkedHashSet<ArrayList>();

        // 4.Объект с подстановочным видом параметра.
        // (A wildcard parameterized type)
        // В Map так добовлять нельзя
        // HashMap<?, String> info = new HashMap<Integer, String>();
        // info.put(23, "wwe");
        // нужно писать: HashMap<Integer, String> info = new HashMap<Integer, String>();

        Pair<?, Integer> pair = new Pair<String, Integer>("wew", 123);

        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Tom");

        listString.add("Jerry");

        // Добавить элемент null в список.
        listString.add(null);


        
    }




}

class Pair <V, K>{
    private V val;
    private K key;

    public Pair(V val, K key) {
        this.val = val;
        this.key = key;
    }
}