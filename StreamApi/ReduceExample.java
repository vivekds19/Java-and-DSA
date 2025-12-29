import java.util.List;

public class ReduceExample {
      public static void main(String args[])
      {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9);
        
        int result=nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .reduce(0,(c,e)->c+e);

            System.out.println(result);

      }
}
