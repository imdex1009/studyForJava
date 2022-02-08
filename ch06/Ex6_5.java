public class Ex6_5 {
    public static void main(String[] args) {
        MathTest mt = new MathTest();

        float result = mt.outSomething();
        System.out.println(result);

    }
}

class MathTest {
    char outSomething() {
        return (char) 36;
    }
}