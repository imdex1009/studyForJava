import java.util.Arrays;

public class Ex11_7 {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa","bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));


    }
}
