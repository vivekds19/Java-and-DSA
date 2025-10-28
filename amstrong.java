public class amstrong {
      static boolean amstrong_(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
       return sum==original;
    }

    public static void main(String[] args) {
          for (int i = 100; i < 1000; i++) {
            if (amstrong_(i)) {
                System.out.println(i);
            }
        }

    }
}
