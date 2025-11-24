
class fibnocci {

    public static void main(String[] args) {
        System.out.println(fibnFormula(7));

    }

    static long fibnFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

}
