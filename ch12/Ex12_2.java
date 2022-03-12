import java.util.ArrayList;


public class Ex12_2 {
    public static void main(String[] args) {
        Object[] objArr = new Object[0];
        int len = objArr.length;
        System.out.println(len);


        // NullPointerException 발생됨
        Object[] objArr2 = null;
        len = objArr2.length;
        System.out.println(len);


    }
}
