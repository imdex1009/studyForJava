import java.util.Optional;

public class Ex14_11 {
    public static void main(String[] args) {
        Optional<String> op = Optional.of("Hello");
        System.out.println(op);

        Optional<String> op2 = Optional.ofNullable(null);
        System.out.println(op2);

//        Optional<String> op3 = Optional.of(null);
        Optional<String> op3 = Optional.empty();
        System.out.println(op3);


    }
}
