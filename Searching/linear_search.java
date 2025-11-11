
class linear_search {

    static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {22, 33, 45, 99, 100, 121};
        int x = 22;
        int result = search(arr, x);

        if (result == -1) {
            System.out.println("The element is not found in the array ");
        } else {
            System.out.println("The element is present at the index " + result);
        }
    }

}
