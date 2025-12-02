
class FindElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 56, 78, 12, 9};
        System.out.println(find(arr, 8, 0));
    }

    static int find(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return find(arr, target, index + 1);
        }
    }
}
