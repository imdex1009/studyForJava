import java.util.Arrays;

public class Ex5_14 {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4};

        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.printf("arr2 = %s", Arrays.toString(arr2));
        // [0, 1, 2, 3, 4]

        int[] arr3 = Arrays.copyOfRange(arr2, 1, 7);
        System.out.printf("arr2 = %s", Arrays.toString(arr3));
        // [1, 2, 3, 4, 0, 0]




    }
}
