public class Ex13_15 {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.printf("Time : %d", System.currentTimeMillis() - start);
    }
}
