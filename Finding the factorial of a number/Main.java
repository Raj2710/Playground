import java.util.*;
class Main
{
  static int sum=1;
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(fact(n));
  }
  public static int fact(int n)
  {
    if(n==0)
    {
      return 1;
    }
    return n * fact(n-1);
  }
}