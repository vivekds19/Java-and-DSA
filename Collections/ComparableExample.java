import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student that) {
        return this.age - that.age; 
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Vivek", 22));
        list.add(new Student("Rahul", 20));
        list.add(new Student("Anita", 21));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
