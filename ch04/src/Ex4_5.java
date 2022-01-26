package src;

import java.util.Scanner;


public class Ex4_5 {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            double a = Math.random();

            int b = (int)(a * 10 + 1);
            System.out.println(b);

        }



    }

}
