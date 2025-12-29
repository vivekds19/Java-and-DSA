import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
      List<String> names=Arrays.asList("Vivek","varun","Vishnu","Vinay");

      Optional<String> name=names.stream()
                                  .filter(str->str.contains("v"))
                                  .findFirst();

      System.out.println(name.orElseGet(()->"Not found"));

    }
}
