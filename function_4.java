class Point {
    // Declaring two integer fields for x and y coordinates
    int x;
    int y;
}

public class function_4 {
    public static void main(String[] args) {
        // Creating a Point object
        Point p = new Point();

        // Assigning values to the coordinates
        p.x = 5;
        p.y = 10;

        // Calling the fun method and passing the Point
        // object
        fun(p);

        // Printing the unchanged coordinates of p
        System.out.println(p.x + " " + p.y);
    }

    // fun method that creates a new Point object and
    // modifies it
    public static void fun(Point p) {
        // Creating a new Point object
        p = new Point();

        // Modifying the new Point object
        p.x = 10;
        p.y = 10;
    }
}