package scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainScanner {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
////        sc.useDelimiter("\n");
//    while (sc.hasNext()) {
//        String a = sc.next();
//        System.out.println(a);
//        if(a.equals("AA")) break;
//    }
//    sc.close();
        method3();
    }
    public static void method1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee id:");
        double empId = scan.nextDouble();
        System.out.print("Enter employee name:");
        String empName = scan.nextLine();
        scan.close();
        System.out.println(empId+" "+empName);
    }
    public static void method2(){
        String s = "Geeksforgeeks hasfor Scanner Class Methods";

        Scanner sc = new Scanner(s);
                System.out.println(sc.findInLine(".....for"));

    }
    public static void method3(){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            int x;
            do {
                while (!sc.hasNextInt()) {
                    sc.next();
                    System.out.println("Введите число!");
                }
                x = sc.nextInt();
                arr[i] = x;
            }while (x<=0);
        }
        System.out.println(Arrays.toString(arr));
    }
}