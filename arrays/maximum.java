
class maximum {

    static int max(int arr[]) {
        int maximum = arr[0];
        if (arr.length <= 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[] = {22, 33, 11, 10, 9, 23};
        System.out.println("the minimum element in an array is " + max(arr));
    }
}
