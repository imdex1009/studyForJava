public class Ex14_2 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

        MyFunction f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5);
        System.out.println("value = "+ value);
    }
}


@FunctionalInterface
interface MyFunction {
    public abstract int max(int a, int b);
}