
class A {

    void showA() {
        System.out.println("A class");
    }
}

class B extends A {

    void showB() {
        System.out.println("B class");
    }
}

class C extends B {

    void showC() {
        System.out.println("C class");
    }
}

public class Test_7 {

    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
