
class Student {

    String name;
}

public class Test_3 {

    public static void main(String[] args) {
        final Student s = new Student();
        s.name = "Vivek";
        // s.new Student(); refernce cannot changed 
        System.out.println(s.name);

    }
}
