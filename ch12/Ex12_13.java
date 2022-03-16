class Parent {
    void parentMethod() {}
}

class Child extends Parent implements Testable{
    @Override
    @Deprecated
    void parentMethod() {
    }

    @Override
    public void test() {
        System.out.println("hello");
    }
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
    void test();
}


public class Ex12_13 {
    @SuppressWarnings("deprecation") // 경고 억제
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated된 메서드 사용
        c.test();
    }
}