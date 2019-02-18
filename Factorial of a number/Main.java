import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
       Scanner i = new Scanner(System.in);
       int n = i.nextInt();
       int j,fact=1;
       for(j=1;j<=n;j++)
         fact=fact*j;
       System.out.println(fact);
    }
}