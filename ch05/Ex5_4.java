import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {

        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i= 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", average);



    }
}
