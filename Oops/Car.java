
public class Car {

    String color;

    void drive() {
        System.out.println("Car is moving");
    }

    void stop() {
        System.out.println("Car is stopped");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.drive();
        myCar.stop();
        System.out.println("My car color is " + myCar.color);
    }
}
