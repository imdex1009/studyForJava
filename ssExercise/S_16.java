import org.jetbrains.annotations.NotNull;

public class S_16 {
    public static void main(String[] args) {
        Parent001<String> p1 = new GrandChild001<>("this is GrandChild001");
//        Child001<String> c1 = new Child001<>("this is Child001");
//        GrandChild001<String> gc1 = new GrandChild001<>("this is GrandChild001");

//        GrandChild001<? super GrandChild001> cc1 = new GrandChild001<GrandChild001>(new Child001<String>("hello"));


        printNum((GrandChild001<?>) p1);
//        printNum(cc1);
//        printNum(c1);
//        printNum(gc1);
    }

    private static void printNum (GrandChild001<?> target) {
        System.out.println(target.getNum());
    }
}


class Parent001<T> {
    T num;


    public Parent001() {
    }

    public Parent001(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }
}


class Child001<T> extends Parent001<T>{


    public Child001(T num) {
        super(num);
    }

    @Override
    public T getNum() {
        return super.getNum();
    }
}


class GrandChild001<T> extends Parent001<T> {

    T num;


    public GrandChild001(T num) {
        super(num);
    }

    @Override
    public T getNum() {
        return super.getNum();
    }
}