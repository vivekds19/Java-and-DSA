
class OldLibrary {
    @Deprecated
    public void oldMethod() {
        System.out.println("This is the old method.");
    }

    public void newMethod() {
        System.out.println("This is the new method.");
    }
}

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
        OldLibrary lib = new OldLibrary();
       // lib.oldMethod();// not recommended to use this method 
        lib.newMethod();
        Parent obj = new Parent();
        obj.show();
    }
}
