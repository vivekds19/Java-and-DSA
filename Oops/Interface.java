
@FunctionalInterface
interface a {

    void show(int i, int j);

}

public class Interface {

    public static void main(String[] args) {
        a obj = (i, j) -> System.out.println("Interface implemented: " + (i + j));

        obj.show(3, 5);
    }
}
