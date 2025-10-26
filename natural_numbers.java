
public class natural_numbers {

    public static int naturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        System.out.println("The sum of n natural numbers:" + naturalNumbers(10));
    }
}
