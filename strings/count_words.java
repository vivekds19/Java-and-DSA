public class count_words {
    public static void main(String[] args) {
        String str = "Hello world welcome to Java programming.";

        int count = 0;
        boolean inWord = false;  
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!inWord) {
                    count++;
                    inWord = true; 
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Word count: " + count);
    }
}
