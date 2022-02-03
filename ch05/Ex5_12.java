import java.util.Arrays;

public class Ex5_12 {
    public static void main(String[] args) {

//        2차원 배열을 비교하는 경우에는 deepEquals 메소드를 사용하여야 한다.
//        1차원 배열을 대상으로 deepEquals 사용 시에는 에러가 발생한다.

//        int[][] intArr1 = {{1, 2}, {3, 4}};
//        int[][] intArr2 = {{1, 2}, {3, 4}};
//
//        boolean result = Arrays.deepEquals(intArr1, intArr2);

        int[] intArr1 = {1, 2};
        int[] intArr2 = {1, 2};

        boolean result = Arrays.equals(intArr1, intArr2);


         System.out.println(result);

    }
}
