import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		Scanner i = new Scanner(System.in);
      	int sum = 0;
      	int n = i.nextInt();
      	while(n>0)
        {
			sum = sum + n%10;
          	n=n/10;
        }
      	System.out.println(sum);
    }
}