
class Subset {

    public static void main(String args[]) {
        subsets(0, 123);
    }

    static void subsets(int number, int nums) {
        if (nums == 0) {
            System.out.println(number);
            return;
        }
        int digit = nums % 10;

        subsets(number * 10 + digit, nums / 10);
        subsets(number, nums / 10);
    }
}
