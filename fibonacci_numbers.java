
import java.util.Scanner;

class fibonacci_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
