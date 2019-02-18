import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int i,j,n,k,count=1;
       n = in.nextInt();
       for(i=1;i<=n;i++)
       {
         for(k=1;k<=n-i;k++)
         {
           System.out.print(" ");
         }
         for(j=1;j<=i;j++)
         {
           System.out.print(count + " ");
           count++;
         }
         System.out.println();
       }
    }
}