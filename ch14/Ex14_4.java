import java.util.*;
import java.util.function.*;


public class Ex14_4 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100) +1 ;
        Consumer<Integer> c = i -> System.out.print(i+", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Long> f = i -> (long)(i / 10 * 10);

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Long> newList = doSomething(f, list);
        System.out.println(newList);

    }

    static <T, R> List<R> doSomething(Function<T, R> f, List<T> list) {
        List<R> newList = new ArrayList<>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for(T i : list) {
            if(p.test((i)))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i=0;  i < 10; i++) {
            list.add(s.get());
        }
    }
}
