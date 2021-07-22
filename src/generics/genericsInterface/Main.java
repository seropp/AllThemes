package generics.genericsInterface;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accountList = Arrays.asList(new Account(12, "Din", 1400.00),new Account("3122", "Kate", 1000.00));
    }
}

interface Accountable<T>{
    T getId();
    double getSalary();
    String getName();

    void setSalary(double salary);
}

class Account<T> implements Accountable<T>{
    private T id;
    private String name;
    private double salary;

    public Account(T id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public T getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
