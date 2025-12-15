
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++"); // key duplicate → value overwritten

        System.out.println(map);

    }
}
