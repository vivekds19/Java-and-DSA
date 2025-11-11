
import java.util.*;

class array2D {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 22, 33},
            {44, 55, 66},
            {77, 88, 99}
        };
        int target = 88;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] == target) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
