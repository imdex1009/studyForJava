import java.util.Arrays;

public class Ex08_3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외메시지: " + ae.getMessage());
        }

        

        System.out.println(6);
    }
}
