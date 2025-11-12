
class maximumArray {

    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        int max = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
