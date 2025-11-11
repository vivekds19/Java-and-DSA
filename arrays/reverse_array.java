
import java.util.*;

class reverse_array {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 9, 8, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, 0, 5);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
