public class Ex5_16 {
    public static void main(String[] args) {

        outer : for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                if (j == 5) {
                    break outer;
                }

                int result = i * j;

                System.out.printf("%d * %d = %d\n", i , j, result);
            }
        }
    }
}
