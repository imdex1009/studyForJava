
import java.util.*;

interface Eatable {}

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy implements Eatable{
    @Override
    public String toString() {
        return "Toy";
    }
}




public class Ex12_6 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Toy> toyBox = new FruitBox<>(); // 에러. 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아님.
        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);


    }
}

class FruitBox<T extends Eatable> extends Box<T> {

}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get (int i ) {return list.get(i);}
    int size() {return list.size();}



    @Override
    public String toString() {
        return list.toString();
    }
}
