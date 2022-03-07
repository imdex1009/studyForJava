import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};

        int[] arr2 = Arrays.copyOf(arr, 4);

        System.out.println(Arrays.toString(arr2));


    }
}
