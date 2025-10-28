
import java.util.Scanner;

public class largest_3_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int ans = Math.max(a, b);
        int result = Math.max(ans, c);
        System.out.println(result);

    }
}
