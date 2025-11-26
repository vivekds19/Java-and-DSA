
class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(5678));
    }

    static int reverse(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return helper(n / 10, rev * 10 + n % 10);
    }
}
