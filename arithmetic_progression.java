
import java.util.Scanner;

// find the nth term value 

// a - starting point  d- is the differnece b/w them n-find the value 
public class arithmetic_progression{
public static int n_term(int a,int d,int n)
{
  int result=a+(n-1)*d;
  return result;
}

public static void main (String [] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of a:");
  int a=sc.nextInt();
  System.out.println("Enter the value of d:");
  int d=sc.nextInt();
  System.out.println("Enter the value of n:");
  int n=sc.nextInt();
  System.out.println(n_term(a,d,n));
}
}