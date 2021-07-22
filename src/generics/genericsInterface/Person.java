package generics.genericsInterface;

public class Person <T,S>{
    private T weight;
    private S password;

    public Person(T weight, S password) {
        this.weight = weight;
        this.password = password;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
