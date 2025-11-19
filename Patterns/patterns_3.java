
class patterns_3 {

    public static void main(String[] args) {
        int n = 4;

        for (int row = 0; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.err.println();
        }

    }
}