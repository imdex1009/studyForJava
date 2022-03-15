import java.lang.reflect.Array;
import java.util.*;

class Fruit2 {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    public Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class Ex12_7 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

        FruitBox2<Fruit2> newFruitBox = new FruitBox2<>();
        newFruitBox.add(new Apple2());
        newFruitBox.add(new Grape2());
        newFruitBox.add(new Apple2());
        newFruitBox.add(new Grape2());

        ArrayList<Fruit2> ls = newFruitBox.getList();
        System.out.println(ls.toString());


        for (Fruit2 fruit : newFruitBox.getList()) {
            System.out.println(fruit.toString());
        }









    }
}

class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}

    @Override
    public String toString() {
        return list.toString();
    }
}
