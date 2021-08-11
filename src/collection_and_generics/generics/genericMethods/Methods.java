package collection_and_generics.generics.genericMethods;

import collection_and_generics.generics.account.Account;

import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        String[] arr1 = {"a","b","c","d","f","e","g","i","k","l"};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 74};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 74};

        Account[] ere =  {new Account("123", "Sam", 3423.23), new Account(232, "Hanna", 700)};

        print(ere);
        System.out.println();
        print(arr1);
        System.out.println();
        print(arr3);
    }

    public static <T> void print(T[] items){
        for (T item: items) System.out.print(item+" ");
    }
}

