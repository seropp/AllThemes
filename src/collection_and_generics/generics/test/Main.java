package collection_and_generics.generics.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    DynamicSizedGarage<Vehicle> dynamicSizedGarage = new DynamicSizedGarage();
        dynamicSizedGarage.addVehicle(new Car());
        dynamicSizedGarage.addVehicle(new Car());
        dynamicSizedGarage.addVehicle(new Truck());
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        dynamicSizedGarage.addAll(cars);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        trucks.add(new Truck());


    }
}
class Vehicle {}

class Car extends Vehicle{}

class Truck extends Vehicle{
}

class DynamicSizedGarage<T extends Vehicle> {
    private final List<T> vehicles;

    DynamicSizedGarage() {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(T t){
        vehicles.add(t);
    }
    public T getVehicle(int index){
        return vehicles.get(index);
    }

    public void removeVehicle(T t){
        vehicles.remove(t);
    }
    public void removeVehicle(int index){
        vehicles.remove(index);
    }
    public void addAll(List<? extends T> list) {
        vehicles.addAll(list);
    }
}