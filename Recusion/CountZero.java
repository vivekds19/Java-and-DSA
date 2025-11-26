
class CountZero {

    public static void main(String v[]) {
        System.out.println(counter(10203000));  
    }

    static int counter(int n) {
        return helper(n, 0);   
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int last = n % 10;

        if (last == 0) {
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
}
