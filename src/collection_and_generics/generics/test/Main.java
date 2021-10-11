package collection_and_generics.generics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Predicate <T>
        // BinaryOperator <T>
        // UnaryOperator <T>
        // Supplier <T>
        // Consumer <T>
        // Function <R,T>
        Main main = new Main();

        Predicate<Main> predicate = m -> (m != null);
        System.out.println(predicate.test(main));

        BinaryOperator<Double> binaryOperator = (x, y) -> (x + y) / 10;
        System.out.println(binaryOperator.apply(35.5, 34.5));

        UnaryOperator<String> unaryOperator = x -> x.toUpperCase() + ".I.Love.JAVA.";
        System.out.println(unaryOperator.apply("like a programmer"));

        Supplier<Main> supplier = () -> new Main();
        System.out.println(supplier.get());

        Integer y = 45;
        Consumer<Integer> consumer = x -> {
            x += 10;
            System.out.println(x);
        };
        consumer.accept(y);
        System.out.println(y);

        Function<String, Integer> integerStringFunction = x -> {
            return Integer.parseInt(x);
        };
        System.out.println(integerStringFunction.apply("342232") / 1000);
    }
}
