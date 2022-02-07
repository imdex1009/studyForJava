public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(3, 5);

        System.out.printf("add(3, 5) = %d", result1);


    }
}

class MyMath {
    long add(long a, long b) {
        return a + b;
    }
}