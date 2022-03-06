import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        Iterator it = list.iterator();


        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        list.add(7);


        Iterator it2 = list.iterator();

        while(it2.hasNext()) {
            try {
                Object obj = it2.next();
                System.out.print(obj + " ");
            } catch(Exception e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }


    }
}
