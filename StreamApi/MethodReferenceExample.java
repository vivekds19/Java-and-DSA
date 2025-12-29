import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {

        List<String> names = List.of("Vivek", "Varun", "Vinay");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
