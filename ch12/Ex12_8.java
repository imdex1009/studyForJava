public class Ex12_8 {
    public static void main(String[] args) {
        BoxTest b = null;
        BoxTest<String> bStr = null;

        b = (BoxTest) bStr;
        bStr = (BoxTest<String>)b;
    }
}

class BoxTest<T> {
    T content;

    public BoxTest(T content) {
        this.content = content;
    }
}
