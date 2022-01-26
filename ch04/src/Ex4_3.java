package src;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수
        char grade = 'D', opt; // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

        System.out.print("점수를 입력하세요. >");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        int rest = score % 10;
        if (rest >= 8) {
            opt = '+';
        } else if (rest < 4) {
            opt = '-';
        } else {
            opt = ' ';
        }

        System.out.println("당신의 학점은 " + grade + opt + "입니다.");

    }
}
