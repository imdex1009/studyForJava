import java.util.Arrays;

public class Ex5_11 {
    public static void main(String[] args) {

        int[] intArr1 = {1};
        int[] intArr2 = {1};
        intArr2 = intArr1;

        boolean result = intArr1 == intArr2; // 배열의 변수명에는 참조 주소만 있으므로 참조 주소가 다르면 false가 뜸

        System.out.println(intArr1);
        System.out.println(intArr2);

        System.out.println(result);
    }
}
