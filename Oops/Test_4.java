class Base {
    int x;

    Base() {
        x = 0;
    }

    Base(int i) {
        x = i;
    }
}

class Derived extends Base {
  int y;
    Derived() {
        super();  // Calls Base class constructor with no parameters
        y=0; 
    }

    Derived(int i, int j) {
        super(i);  // Calls Base class constructor with one parameter
        y = j;
    }
}

class Test_4 {
    public static void main(String[] args) {
        Derived d = new Derived(10, 20);
        System.out.println(d.x);  
        System.out.println(d.y);  
    }
}