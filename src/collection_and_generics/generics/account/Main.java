package collection_and_generics.generics.account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("212", "Bill", 400);
        Account<Integer> acc2 = new Account<>(123, "Douglas", 890);
        Account<Double> acc3 = new Account<>(1234.23, "Viki", 1890);

        List<Account> staff = Arrays.asList(acc1, acc2, acc3);

        staff.stream()
                .filter(z-> {
                    if (z.getSalary()>1000)
                    z.setSalary((z.getSalary()-z.getSalary()*0.4));
                    return true;
                })
                .flatMap(x -> Stream.of(
                        String.format("Name: %s (id: %s)- new salary: %.2f:",x.getName(), x.getId(), x.getSalary()+x.getSalary()*0.4)))
                .forEach(System.out::println);
    }
}
