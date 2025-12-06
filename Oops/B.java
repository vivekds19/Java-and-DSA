
class A {

    final void show() {
        System.out.println("Final method in class A");
    }
}

class C extends A {
    // void show()
    // {
    // final method cannot be overridden in child class
    // }

    void show1() {
        System.out.println("Final method in class B");
    }
}

public class B {

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show1();
    }
}
