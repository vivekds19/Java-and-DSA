
class maximumDifference {

    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 20};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int difference = max - min;
        System.out.println(difference);

    }
}
