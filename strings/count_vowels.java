class count_vowels {
    public static void main(String[] args) {
        String str = "hello world";
        int vowelCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
} 