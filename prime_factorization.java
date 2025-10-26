
import java.util.Scanner;

public class prime_factorization {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    for(int n=2;n<=num;n++)
    {
    while(num%n==0)
    {
      
      System.out.println(n);

      num=num/n;
    }
    }

  }
}
