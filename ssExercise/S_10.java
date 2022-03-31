import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S_10 {
    public static void main(String[] args) {

        String[] strArr = {"aaa", "bb", "c", "dddd"};

        int sum = Stream.of(strArr)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println("sum = " + sum);

    }
}
