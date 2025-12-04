class Point {
  int x,y;
  Point(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  void display()
  {
    System.out.println("x: "+x);
    System.out.println("y: "+y);
  }
}

public class constructor_1 {
  public static void main(String[] args) {
      Point p1=new Point(10,20);
      p1.display();
      Point p2=new Point(30,40);
      p2.display();
  }
}

