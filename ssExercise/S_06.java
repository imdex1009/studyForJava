import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class S_06 {

    static class BoxMo {
        private int value;

        public BoxMo() {}

        public BoxMo(int value) {
            this.value = value;
        }


        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "BoxMo{" +
                    "value=" + value +
                    '}';
        }
    }


    public static void main(String[] args) {
        Supplier<BoxMo> s = BoxMo::new;
        BoxMo b1 = s.get();
        b1.setValue(12);
        System.out.println(b1);

        Function<Integer, BoxMo> f = BoxMo::new;
        System.out.println(f.apply(14));

        Consumer<String> c = System.out::println;
        c.accept("100");

        Predicate<Integer> p = S_06::isEven;
        System.out.println(p.test(13));
    }

    static boolean isEven(int num) {return num % 2 != 0;}
}


