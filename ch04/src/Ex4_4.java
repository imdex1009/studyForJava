package src;

import java.awt.*;
import java.util.Scanner;



public class Ex4_4 {
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

        System.out.println("현재 월을 입력하세요. >");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();



        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
            default:



                System.out.println(TEXT_RED + "입력하신 월이 범위를 초과하였습니다." + TEXT_RESET);

                System.out.println("범위 (1 ~ 12)");
                System.out.println("입력하신 월을 다시 확인해주세요");

        }
    }

}
