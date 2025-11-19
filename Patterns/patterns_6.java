
class patterns_6 {

    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < 2 * n; row++) {

            int totalcolsinRow = row > n ? 2 * n - row : row;
            int noofSpace = n - totalcolsinRow;

            for (int space = 0; space < noofSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalcolsinRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
