import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}


public class ComparatorExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "Vivek"));
        list.add(new Student(20, "Rahul"));
        list.add(new Student(21, "Anita"));

        
        Comparator<Student> com = (s1, s2) -> s1.age - s2.age;

        Collections.sort(list, com);

        for (Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
