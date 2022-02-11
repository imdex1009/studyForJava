import java.util.Arrays;

public class Ex6_2 {
    public static void main(String[] args) {

        Tv1[] tvArr = new Tv1[3];

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv1();
        }

        System.out.println(Arrays.deepToString(tvArr));


    }
}