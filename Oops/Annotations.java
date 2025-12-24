class Parent {
  @Deprecated
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child");
    }
}
public class Annotations {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
    }
}
