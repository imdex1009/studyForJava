import java.util.Arrays;

public class Ex5_18 {
    public static void main(String[] args) {

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = ballArr[j];
            ballArr[j] = ballArr[0];
            ballArr[0] = tmp;

        }

        ball3 = Arrays.copyOf(ballArr, 3);

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }

    }
}
