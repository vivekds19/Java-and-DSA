class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }
}
