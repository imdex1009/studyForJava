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

	String str2 = "가나다라 마바사";
	System.out.println(str2);
    }
}
