
class minimum_array {

    static int min(int arr[]) {
        int minimum = arr[0];
        if (arr.length <= 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int arr[] = {22, 33, 11, 10, 9, 23};
        System.out.println("the minimum element in an array is " + min(arr));
    }
}
