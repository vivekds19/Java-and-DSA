class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(123));  
    }
    static int sum(int n) {
        int num = 0;
        while (n > 0) {
            int lastdigit = n % 10;   
            num = num + lastdigit;    
            n = n / 10;              
        }
        return num;
    }
}