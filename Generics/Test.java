
class Box<T> {

    T value;    // T is a type parameter it can be integer,string

    Box(T value) {
        this.value = value;
    }

    T getvalue() {
        return value;
    }
}

public class Test {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("hello");

        System.out.println(b1.getvalue());
        System.out.println(b2.getvalue());
    }
}
