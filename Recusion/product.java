
class product {

    public static void main(String[] args) {
        System.out.println(productOfNUmber(55));
    }

    static int productOfNUmber(int num) {
        if (num % 10 == num) {
            return num;
        } else {
            return num % 10 * productOfNUmber(num / 10);
        }
    }
}
