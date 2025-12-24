
@FunctionalInterface // fnctional interface should have only one abstract method
interface a {

    void show();

    // void display();
}

// class b implements a {
//     public void show() {
//         System.out.println("Interface implemented");
//     }
// }
public class Interfaces {

    public static void main(String[] args) {
        a obj = new a() {
            public void show() {
                System.out.println("Interface implemented");
            }
        };
        obj.show();
    }
}
