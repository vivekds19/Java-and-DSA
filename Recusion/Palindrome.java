
class Palindrome {

    public static void main(String[] args) {
        String str = "eyes";
        System.out.println(isPalindrome(str.toCharArray(), 0, str.length() - 1));
    }

    static boolean isPalindrome(char[] str, int start, int end) {

        if (start == end) {
            return true;
        }
        if (str[start] != str[end]) {
            return false;
        }
        if (start < end) {
            return isPalindrome(str, start + 1, end - 1);
        }
        return true;
    }

}
