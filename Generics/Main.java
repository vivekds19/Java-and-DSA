
class Main {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(100);       // Integer
        display("Vivek");   // String
        display(20.5);      // Double
    }
}
