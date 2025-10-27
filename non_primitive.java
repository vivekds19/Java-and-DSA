class point{
  int x;
  int y;
}
public class non_primitive {
  public static void main(String[] args) {
    point p1=new point();
    p1.x=10;
    p1.y=20;
    System.out.println("x is:"+p1.x+"  y is:"+p1.y);
  }

}