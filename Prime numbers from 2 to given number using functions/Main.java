import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n,i,count,j;
      n = in.nextInt();
      for(i=2;i<=n;i++)
      {
        count = 0;
		for(j=2;j<=i/2;j++)
        {
		    if(i%j==0)
            {
              count++;
              break;
            }
        }
        if(count==0)
          System.out.println(i);
      }
	}
}