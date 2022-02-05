import java.util.Arrays;

public class Ex6_2 {
    public static void main(String[] args) {

        Tv[] tvArr = new Tv[3];

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }

        System.out.println(Arrays.deepToString(tvArr));


    }
}