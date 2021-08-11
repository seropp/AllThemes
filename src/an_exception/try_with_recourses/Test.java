package an_exception.try_with_recourses;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Throwable {

        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }

}

class TestOwnException extends Exception{
    public TestOwnException(String message) {
        super(message);
    }
}
