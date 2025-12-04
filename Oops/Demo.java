
public class Demo {

    Demo() {
        this(10); // this calls the parameterized constructor
        System.out.println("Default constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);

    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
