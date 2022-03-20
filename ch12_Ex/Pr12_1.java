class Box3<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }
}




public class Pr12_1 {
    public static void main(String[] args) {
//        Box3<Object> b = new Box3<String>();
//        Box3<Object> b = (Object)new Box3<String>();
//        new Box3<String>().setItem(new Object());
        new Box3<String>().setItem("ABC");

    }
}
