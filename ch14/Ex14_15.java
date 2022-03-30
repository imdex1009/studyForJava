import java.util.stream.IntStream;

public class Ex14_15 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 10);

        IntStream.range(1, 10).sequential().forEach(System.out::print);
        System.out.println();

        int count = intStream.reduce(0, (a, b) -> a + 1);
        System.out.println("count = " + count);
        
        int sum = IntStream.rangeClosed(1, 10)
                .peek(i -> System.out.println(i + " : " +  (i % 2 != 0)))
                .reduce(0, (a, b) -> b % 2 == 0 ? a : a + b);
        System.out.println("sum = " + sum);




    }
}
