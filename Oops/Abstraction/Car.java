
public class Car implements Engine, Color {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void color() {
        System.out.println("Car color is red");
    }

}
