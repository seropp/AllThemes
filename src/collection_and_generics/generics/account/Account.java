package collection_and_generics.generics.account;

public class Account <T>{
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

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

