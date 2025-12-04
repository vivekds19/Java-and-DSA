
class Point {

    int x, y;

    // Default Constructor
    Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class constructor_3 {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 20);
        Point p3 = p2; /*  p2 is a reference pointer that points to the object in the memory 
        p3 will now point to the same object that p2 is pointing to.*/
        p1.print();
        p3.print(); 
    }
}
