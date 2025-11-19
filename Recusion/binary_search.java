
class binary_search {

    public static void main(String[] args) {
        int arr[] = {33, 44, 12, 55, 16, 77};
        int target = 16;
        System.out.println(bs(arr, target, 0, arr.length - 1));
    }

    static int bs(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return bs(arr, target, mid + 1, end);
        } else {
            return bs(arr, target, start, mid - 1);
        }

    }
}
