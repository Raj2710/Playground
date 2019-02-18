import java.util.Scanner;
public class Main
{
  	public static int gcd(int n1,int n2)
    {
      int i,max;
      max = n1>n2?n1:n2;
      for(i=max;i>=1;i--)
      {
        if(n1%i==0 && n2%i==0)
        {
			return i;
        }
      }
      return i;
    }
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      	int num1,num2,num3,gcd;
      	num1 = in.nextInt();
      	num2 = in.nextInt();
      	num3 = in.nextInt();
      	gcd = gcd(num1,num2);
      	gcd = gcd(gcd,num3);
      	System.out.println(gcd);
	}
}