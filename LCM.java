
class LCM {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int x = Math.max(a, b);
        int ans = x;
        int y = a * b;
        for (int i = x; i <= y; i++) {
            if (i % a == 0 && i % b == 0) {
                ans = i;
                break;
            }
        }
        System.out.println("LCM is:" + ans);

    }
}
