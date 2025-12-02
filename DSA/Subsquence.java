
class Subsquence {

    public static void main(String[] args) {
        sub("", "abc");
    }

    static void sub(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        sub(p + ch, str.substring(1));
        sub(p, str.substring(1));
    }
}
