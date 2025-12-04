
class Students {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Student {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Vivek";
        s1.age = 23;
        s1.study();

        Students s2 = new Students();
        s2.name = "Varun";
        s2.age = 23;
        s2.study();
    }

}
