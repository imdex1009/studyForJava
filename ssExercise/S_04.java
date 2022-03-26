import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class S_04 {
    public static void main(String[] args) {
        add(1, 2, 3);
    }

    private static <T> void add(T ...nums) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(nums));

        for(T i : list) {

            System.out.println(list.indexOf(i));
            System.out.println(list.contains(i));
        }

    }

}
