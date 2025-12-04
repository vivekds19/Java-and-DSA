
class Point {

    int x, y;

    Point(int a, int b) {
        x = a;
        y = b;
    }

    void print() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

public class Para_constructor {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        p1.print();

    }
}
