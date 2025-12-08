
class parent {

    int a = 20;
}

class child extends parent {

}

class Test_6 {

    public static void main(String[] args) {
        child c = new child();
        c.a = 30;
        System.out.println(c.a); // overriding the parent class variable

    }
}
