
class Sorted {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
        System.out.println(Sort(arr, 0));

    }

    static boolean Sort(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && Sort(arr, index + 1);

    }
}
