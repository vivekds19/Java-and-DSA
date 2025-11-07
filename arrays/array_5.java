
import java.util.Arrays;

class array_5 {

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50, 30};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("after sorting");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
