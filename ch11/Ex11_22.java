import java.util.*;
import static java.util.Collections.*;

class Ex11_22 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        Collections.addAll(list, 1,2,3,4,5);
        System.out.println(list);

        Collections.rotate(list, 2); // 오른쪽으로 두 칸씩 이동
        System.out.println(list);

        Collections.swap(list, 0, 2); // 첫 번째와 세 번째를 교환
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list );

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max=" + max(list));
        System.out.println("min=" + min(list));
        System.out.println("min=" + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list=" + list);

        List newList = nCopies(list.size(), 2);
        System.out.println("newList=" + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList=" + newList);
        System.out.println("list=" + list);

        replaceAll(list, 2, 1);
        System.out.println("list=" + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2="+list2);

    }
}