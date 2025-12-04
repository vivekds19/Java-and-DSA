
import java.io.IOException;

class Point {

    int x;
    int y;

    void print() {
        System.out.println("x= " + x + ", " + "y= " + y);

    }
}
    public class Default_constructor {

        public static void main(String[] args) throws IOException {
            Point p = new Point();
            p.print();
        }

    }
