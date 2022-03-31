import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.Random;
import java.util.stream.IntStream;

public class S_12 {
    public static void main(String[] args) {

        new Random().ints(1, 46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);



    }
}
