class Student {

    private String name;   // data is hidden
    private int age;

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0)        // validation
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Test_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vivek");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
