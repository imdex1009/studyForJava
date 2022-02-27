public class Ch9_11 {
    public static void main(String[] args) {
        byte b = 120;
        short s = 32765;
        for (int i = 1; i <= 10; i++) {
            b += 1;
            s += 1;
            System.out.printf("%02d | byte=%4d | short=%6d\n", i ,b, s);
        }
    }
}
