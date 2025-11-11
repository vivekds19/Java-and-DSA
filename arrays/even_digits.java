
class even_digits {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int digits = 0;
            while (num > 0) {
                num /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
