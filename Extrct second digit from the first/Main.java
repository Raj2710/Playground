import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		Scanner i = new Scanner(System.in);
      	int n = i.nextInt();
      	while(n>99)
          n=n/10;
      	System.out.println(n%10);
    }
}