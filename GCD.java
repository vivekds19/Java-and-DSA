
class GCD {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result = 1;
        int x = Math.min(a, b);
        for (int i = 1; i <= x; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;

            }
        }
        System.out.println("GCD is: " + result);
    }

}
