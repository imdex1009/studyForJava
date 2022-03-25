public class S_02 {
    public static void main(String[] args) {
        long result = multiply(2, 4);
        long result2 = multiply(2L, 4L);
        long result3 = multiply(2L, 4);
        long result4 = multiply(2, 4L);
        System.out.printf("result=%d\n", result);
        System.out.printf("result2=%d\n", result2);
        System.out.printf("result3=%d\n", result3);
        System.out.printf("result4=%d\n", result4);

    }


    public static int multiply (int a, int b) {
        return a * b;
    }
    public static long multiply (long a, long b) { return a * b; }
    public static long multiply (long a, int b) {return a * b;}
    public static long multiply (int a, long b) {return a * b;}
}
