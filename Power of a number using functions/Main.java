import java.util.Scanner;
class power
{
public int pow(int b , int e)
{
    int i,sum=1;
    for(i=1;i<=e;i++)
    {
	    sum=sum*b;
    }
    return sum;
}
}
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    power p = new power();
    int b,e;
    b = in.nextInt();
    e = in.nextInt();
    System.out.println(p.pow(b,e));
  }
}