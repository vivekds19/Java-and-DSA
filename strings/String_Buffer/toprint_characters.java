class toprint_characters {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
    }
}