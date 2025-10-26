public class geometric_progression{
  public static int n_term(int a,int r,int n)
{
  int result=a*(int)Math.pow(r,n-1);
  return result;
}
public static void main(String [] args)
{
  System.out.println("The nth term of the GP is:"+n_term(2,2,4));
}

}