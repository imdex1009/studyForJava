import java.util.ArrayList;
import java.util.Arrays;

public class Ex5_9 {
    public static void main(String[] args) {

        outer: for (int i = 1; i < 10; i++) {
            inner : for (int j = 1; j < 10; j++) {
                int result = i * j;

                if (result == 14) {
                    break inner;
                }

                System.out.printf("%d * %d = %d\n", i, j, result);
            }
        }

    }
}
