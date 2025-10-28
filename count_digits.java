
import java.util.Scanner;

class count_digits {

    public static void count(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        count(n);
    }
}
