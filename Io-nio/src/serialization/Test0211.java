package serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test0211 {

    public static void main(String[] args) {
        Person person1 = new Person("Sergey", 25,  (new Car<Integer>("Tesla Model S", 666)));
        try(ObjectOutputStream oOS = new ObjectOutputStream(Files.newOutputStream(Path.of("A:\\TestFiles\\serial.txt"))))
        {
            oOS.writeObject(person1);
        }catch (IOException e){
            e.printStackTrace();
        }
        try (ObjectInputStream oIS = new ObjectInputStream(Files.newInputStream(Path.of("A:\\TestFiles\\serial.txt")))){
            Person p = (Person)oIS.readObject();
            System.out.printf("Имя:%s Возраст:%d Машина:%s" ,p.getName(),p.getAge(), p.getCar());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

class Person extends Serialization {
    @Serial
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    transient private Car car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
class Car<T> extends Serialization {
    private String Model;
    private T carNumber;

    public Car(String model, T carNumber) {
        Model = model;
        this.carNumber = carNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public T getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(T carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Model car " + Model+" Car number=" + carNumber;
    }
}