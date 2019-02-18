import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		Scanner i = new Scanner(System.in);
      	int n = i.nextInt();
      	int last_digit = n%10;
      	while(n>9)
        {
			n=n/10;
        }
      	System.out.println(last_digit+n);
          
	}
}