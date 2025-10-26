public class first_digit {
  public static void main(String[] args) {
      int number=12345;
      while(number>=10)
      {
        number=number/10;
      }
      System.out.println(number);
  }
}
