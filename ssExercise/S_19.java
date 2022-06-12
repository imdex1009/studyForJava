import java.lang.reflect.Array;
import java.util.Arrays;

public class S_19 {
    public static void main(String[] args) {

        int[] input1 = new int[] { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        quickSort(input1, 0, input1.length-1);
        printArr(input1);


    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    protected static int partition(int[] arr, int low, int high) {
        int p = low, j;
        for(j=low+1; j<= high; j++) {1
            if(arr[j] < arr[low]) {
                swap(arr, ++p, j);
            }
        }
        swap(arr, low, p);
        return p;
    }

    protected static void swap(int[] arr, int low, int pivot) {
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
