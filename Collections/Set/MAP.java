import java.util.*;


public class MAP {
    public static void main(String[] args) {
      Map<Integer,String> students=new HashMap<>();
      
      students.put(1, "vivek");
      students.put(2, "varun");
      students.put(3, "vinay");
      students.put(4, "vishnu");
      students.put(5, "vikas");
      students.put(1, "vik");


      System.out.println(students.keySet());
      System.out.println(students);

      for(Integer key:students.keySet())
      {   
          System.out.println(key +":"+students.get(key));
      }
      System.out.println();
    }
}
