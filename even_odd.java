
import java.util.Scanner;

class even_odd{
  public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if((num /2 )*2==num)
        {
          System.out.println("Even");
        }
        else{
          System.out.println("Odd");
        
      }
  }
}