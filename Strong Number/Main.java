import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int digit=0,sum=0,i,copy = n;
      while(copy!=0)
      {
        sum = sum + (power(copy%10));
        copy=copy/10;
      }
      if(n==sum)
		System.out.println("Yes");
      else
        System.out.println("No");
	}
  	static int power(int n)
    {
      int i,fact=1;
      for(i=1;i<=n;i++)
      {
		fact=fact*i;
      }
      return fact;
    }
}