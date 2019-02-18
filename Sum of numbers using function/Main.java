import java.util.Scanner;
class Main
{
    static int square(int n)
    {
      int i,sum=0;
      for(i=1;i<=n;i++)
        sum=sum+i;
      return sum;
    }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     System.out.print(square(n));
	} 
}