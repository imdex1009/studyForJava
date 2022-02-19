public class Ex08_4 {
    public static void main(String[] args) throws Exception{
//        method1();

//        try {
//            method1();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}

// 예외를 떠넘기는 경우
// main 함수에서도 예외가 처리되지 않으면 JVM의 기본예외처리기가 관련 내용을 출력한다.