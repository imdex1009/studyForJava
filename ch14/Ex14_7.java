import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print);
//        System.out.println();
//
//        intStream = list.stream();
//        intStream.forEach(System.out::print);
//        System.out.println();


        String[] strArr = new String[]{"a", "b", "c", "d"};
        Stream<String> stringStream = Stream.of(strArr);
        stringStream.forEach(System.out::print);
        System.out.println();

        stringStream = Arrays.stream(strArr);
        stringStream.forEach(System.out::print);
        System.out.println();

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
//        intStream.forEach(System.out::print);
        System.out.println("count: " + intStream.count());

        intStream = Arrays.stream(intArr);
        System.out.println("count: " + intStream.sum());

        intStream = Arrays.stream(intArr);
        System.out.println("count: " + intStream.average());

        IntStream intStream1 = new Random().ints();
        intStream1.limit(5).forEach(System.out::println);
    }
}