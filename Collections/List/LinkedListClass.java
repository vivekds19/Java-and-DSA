import java.util.*;

public class LinkedListClass {
    public static void main(String [] args)
    {
      List<Integer> list=new LinkedList<>();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addLast(20);
      list.addLast(30);
      
      System.out.println(list);
    }

}
