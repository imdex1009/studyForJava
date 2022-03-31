import java.util.stream.Stream;

public class S_08 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbbsdf", "cccasdf"};

        Stream.of(strArr)
                .map(String::length)
                .forEach(System.out::println);
    }
}
