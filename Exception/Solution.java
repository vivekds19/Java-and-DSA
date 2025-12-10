
class Solution {

    public static void main(String[] args) {

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }

    }
}
