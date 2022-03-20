class TestMo {
//    @Override
//    public String toString() {
//        return "TestMo{}";
//    }
}


public class Pr12_2 {
    public static void main(String[] args) {
        String str = new TestMo().toString();
        System.out.println(str);

        Object obj = new TestMo();
        System.out.println(obj);
    }
}
