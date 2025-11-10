
class string_2 {

    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "welcome";
        String str3 = new String("welcome");
        String str4 = new String("welcome");

        System.out.println("without using objects: " + str1.equals(str2));
        System.out.println("with using objects: " + str3.equals(str4));

        System.out.println("comparison without object: " + (str1 == str2));
        System.out.println("comparison with objects: " + (str3 == str4));
    }
}
