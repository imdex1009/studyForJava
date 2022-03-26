import java.util.*;

public class S_05 {
    public static void main(String[] args) {
        Map<String, Integer> stringlength = new HashMap<>();
        stringlength.computeIfAbsent("John", s -> null);
        System.out.println(stringlength);

    }


}
