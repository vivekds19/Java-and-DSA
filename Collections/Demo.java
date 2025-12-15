
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);  // duplicate not allowed

        System.out.println(set);

    }
}
