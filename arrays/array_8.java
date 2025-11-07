
import java.util.*;

class array_8 {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 4)));
    }
}
