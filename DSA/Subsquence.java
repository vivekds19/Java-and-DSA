class Subsquence {
    public static void main(String[] args) {
        System.out.println(sub("abc"));
    }

    static String sub(String str) {
        return helper("", str);
    }
    static String helper(String p, String str) {
        if (str.isEmpty()) {
            return p + " ";
        }

        char ch = str.charAt(0);

        String include = helper(p + ch, str.substring(1));
        String exclude = helper(p, str.substring(1));

        return include + exclude;
    }
}
