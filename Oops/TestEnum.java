// in java enum is a special data type used to set a constant vlaues
import java.util.Arrays;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class TestEnum {
    public static void main(String[] args) {
        Day[] today = Day.values();
        System.out.println(Arrays.toString(today));
    }
}
