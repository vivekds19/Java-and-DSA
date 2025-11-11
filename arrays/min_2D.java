
class min_2D {

    public static void main(String[] args) {
        int[][] arr = {
            {22, 33, 11},
            {12, 32, 445, 12},
            {100, 1, 9}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element < minimum) {
                    minimum = element;
                }

            }
        }
        return minimum;
    }
}
