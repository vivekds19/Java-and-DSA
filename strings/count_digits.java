
class count_digits {

    public static void main(String[] args) {
        String str = "hello123";
        int digitsCount = 0;
        int letterCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digitsCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            }

        }
        System.out.println("The no of digits present in the String is:" + digitsCount);
        System.out.println("The no of letters present in the String is:" + letterCount);
    }
}
