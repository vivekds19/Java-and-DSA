
class Point {
    // Declaring two integer fields for x and y coordinates
    int x;
    int y;
}

public class function_3 { 
    public static void main(String[] args) { 
        // Creating a Point object
        Point p = new Point();
        
        // Assigning values to the coordinates
        p.x = 5; 
        p.y = 10;

        // Calling the fun method and passing the Point object
        fun(p);
        
        // Printing the updated coordinates of p
        System.out.println(p.x + " " + p.y);
    } 
    
    // fun method that modifies the fields of the passed Point object
    public static void fun(Point p) {
        // Modifying the fields of Point object p
        p.x = 10; 
        p.y = 10;
    }
}