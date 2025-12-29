
import java.util.List;

public class StreamExample {
      public static void main(String args[])
      {
        List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9);
        
        nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(n->System.out.println(n));

      }
}
