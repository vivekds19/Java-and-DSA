
class Parent {

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child show()");
    }

    void display() {
        super.show(); // calls Parent show()
        show();       // calls Child show()
    }
}

public class Test_5 {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
