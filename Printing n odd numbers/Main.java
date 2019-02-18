import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int count=1,value=1;
      while(count<=n)
      {
        if(value % 2 == 1)
        {System.out.println(value);
        count++;
        }
        value++;
      }
	}
}