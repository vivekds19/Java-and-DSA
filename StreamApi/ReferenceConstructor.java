import java.util.*;

class Student{

  private String name;
  private int age;


  public Student(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }  
  
}



public class ReferenceConstructor {
    public static void main(String[] args) {
      List<String> names=Arrays.asList("vivek","jon","mohan");

      List<Student> students=new ArrayList<>();

      // students=names.stream()
      //           .map(name->new Student(name))
      //           .toList();

      //           System.out.println(students);   //lambda expression

      students=names.stream()
                .map(Student::new)
                .toList();

                System.out.println(students); 

    }
}
