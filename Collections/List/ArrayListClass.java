import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(10);
        list.add(30);

        System.out.println(list.get(1));
        System.out.println(list.indexOf(10));
        System.out.println(list);
    }
}
