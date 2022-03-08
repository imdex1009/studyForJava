
import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);

        List list2 = new ArrayList(set);
        Collections.sort(list2);
        System.out.println("list2 = " + list2);
    }
}
