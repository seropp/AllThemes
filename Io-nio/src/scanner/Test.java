package scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        vowelCheck();
        numberCheck();
    }


    public static void vowelCheck() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("[aeoui]")) {
            sc.next();
        }
        String x = sc.next();

        System.out.println(x);
        sc.close();
    }

    public static void numberCheck() {
        Scanner sc = new Scanner(System.in);
        int number;
        do{

            System.out.println("Please enter a positive number");
            while (!sc.hasNextInt()) {
                sc.next();
            }
            number = sc.nextInt();
        }while (number<=0);

        System.out.println(number);
        sc.close();
    }
}
