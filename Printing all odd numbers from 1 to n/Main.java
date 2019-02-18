import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	  Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int j;
      for(j=1;j<=n;j++)
        if(j%2==1)
          System.out.println(j+" ");
	}
}