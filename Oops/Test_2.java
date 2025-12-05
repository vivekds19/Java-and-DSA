
class Outer {

    static class Inner {

        void msg() {
            System.out.println("Static inner class");
        }
    }
}

class Test_2 {

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // Correct
        obj.msg();
    }
}
