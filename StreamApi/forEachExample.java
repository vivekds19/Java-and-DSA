
import java.util.List;

public class forEachExample {
      public static void main(String args[])
      {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);

        list.forEach(n ->System.out.println(n));
      }
}
