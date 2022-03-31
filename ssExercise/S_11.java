import java.util.stream.Stream;

public class S_11 {
    public static void main(String[] args) {

        String[] strArr = {"aaa", "bb", "c", "dddd"};

        int length = Stream.of(strArr)
                .map(String::length)
                .reduce(0, Math::max);

        System.out.println(length);

    }
}
