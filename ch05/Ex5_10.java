import java.util.Arrays;

public class Ex5_10 {
    public static void main(String[] args) {

        String str1 = "hello world";

        String tmp = str1.substring(1);
        char[] charArr = str1.toCharArray();
        System.out.println(tmp);
        System.out.println(Arrays.toString(charArr));

    }
}
