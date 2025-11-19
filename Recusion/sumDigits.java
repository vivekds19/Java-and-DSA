
class sumDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123456));
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return sumOfDigits(num / 10) + num % 10;
        }
    }
}
