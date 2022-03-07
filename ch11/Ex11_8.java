import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex11_8 {
    public static void main(String[] args) {
        List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        list = Arrays.asList(1, 2, 3, 4, 5);
        list.add(6);

        list = new ArrayList(Arrays.asList(1,2,3,4,5));



    }
}
