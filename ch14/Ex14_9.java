import java.util.stream.*;

public class Ex14_9 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(3)
                .limit(5)
                .forEach(System.out::print);
        System.out.println();


        IntStream intStream1 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
        intStream1.distinct().forEach(System.out::print);


        System.out.println("--3--");

    }
}
