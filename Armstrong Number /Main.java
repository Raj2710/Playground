import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int digit=0,sum=0,i,copy = n;
      while(copy!=0)
      {
        copy=copy/10;
        digit++;
      }
      copy=n;
      while(copy!=0)
      {
        sum = sum + (power((copy%10),digit));
        copy=copy/10;
      }
      if(n==sum)
		System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
  	static int power(int base,int exp)
    {
      int i,pow=1;
      for(i=0;i<exp;i++)
      {
		pow = pow*base;
      }
      return pow;
    }
}