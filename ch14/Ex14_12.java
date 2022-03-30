import java.util.Optional;

public class Ex14_12 {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.of("abc");

        String str1 = optVal.get();
        System.out.println("str1 = " + str1);

        String str2 = optVal.orElse("");
        System.out.println("str2 = " + str2);

        String str3 = optVal.orElseGet(String::new);
        System.out.println("str3 = " + str3);

        String str4 = optVal.orElseThrow(NullPointerException::new);
        System.out.println("str4 = " + str4);
    }
}
