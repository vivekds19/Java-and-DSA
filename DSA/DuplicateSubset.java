
import java.util.*;

class DuplicateSubset {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> output = subsetsDuplicate(arr);
        for (List<Integer> list : output) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetsDuplicate(int[] arr) {
        Arrays.sort(arr); 
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }

            end = ans.size() - 1;   
            int n = ans.size();

            for (int j = start; j < n; j++) {  
                List<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(arr[i]);        
                ans.add(internal);
            }
        }
        return ans;
    }
}
