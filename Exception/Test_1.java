
class Test_1 {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception occured");

        } finally {
            System.out.println("This will always execute. ");
        }
    }
}
