import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * numbers.length);

            if (n < 0 || 9 < n) {
                System.out.println("out of range!");
            }

            int tmp = numbers[0];
            numbers[0] = numbers[n];
            numbers[n] = tmp;

        }

        System.out.println(Arrays.toString(numbers));

    }
}
