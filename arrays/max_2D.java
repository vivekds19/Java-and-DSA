
class max_2D {

    public static void main(String[] args) {
        int[][] arr = {
            {22, 33, 11},
            {12, 32, 445, 12},
            {100, 1, 9}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > maximum) {
                    maximum = element;
                }

            }
        }
        return maximum;
    }
}
