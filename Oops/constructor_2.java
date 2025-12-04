class Point{
  void m1()
  {
    System.out.println("Inside m1");
  }
  void m2()
  {
    this.m1();
  }
}
public class constructor_2 {
public static void main(String[] args) {
    Point p =new Point();
    p.m2();
}
}
