public class S_07 {
    public static void main(String[] args) {
        TestBox tb = new TestBox();
        TestBox tb2 = newBox(tb);

        System.out.println(tb.hashCode());
        System.out.println(tb2.hashCode());




    }

    public static TestBox newBox(TestBox box) {
        return box.constructor();
    }
}

class TestBox {
    int value = 30;

    public TestBox() {}

    public TestBox(int value) {
        this.value = value;
    }

    public TestBox constructor() {
        return new TestBox();
    }


}
