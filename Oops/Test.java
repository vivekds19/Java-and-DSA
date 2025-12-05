
class Student {

    static String schoolName ; //static variable
    String name; //non static variable 

    Student(String name) {

        this.name = name;
    }

}

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Vivek");
        Student s2 = new Student("Varun");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.schoolName);
    }
}
