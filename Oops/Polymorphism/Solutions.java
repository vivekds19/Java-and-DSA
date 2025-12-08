
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;

    }
}

public class Solutions {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.sum(10, 20, 30));
        System.out.println(c.sum(10.5, 20.5));

    }

}
