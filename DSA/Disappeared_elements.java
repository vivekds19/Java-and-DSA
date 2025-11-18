
import java.util.*;

class Disappeared_elements {

    public static void main(String args[]) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(arr);

        System.out.println(result);   
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
}
