package an_exception.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int test;
//
//        do {
//            System.out.println("Please enter a positive number!");
//            while (!sc.hasNextInt()){
//                sc.next();
//                System.out.println("U didn't enter a number");
//            }
//            test = sc.nextInt();
//        } while (test > -100);
//
//        System.out.println(test);
        System.out.println(x());
    }

    static int x() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        return (int)Integer.parseInt(s);
    }
}
