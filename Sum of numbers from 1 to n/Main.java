import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner m = new Scanner(System.in);
      int n = m.nextInt();
      int i,sum=0;
      for(i=1;i<=n;i++)
      {
        sum+=i;
      }
      System.out.println(sum);
	}
}