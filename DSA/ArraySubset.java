
import java.util.*;

class ArraySubset {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> output = subsets(arr);
        for (List<Integer> list : output) {
            System.out.println(list);
        }

    }

    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int num : arr) {
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(ans.get(i));

                internal.add(num);
                ans.add(internal);

            }
        }
      return ans;
    }
}
