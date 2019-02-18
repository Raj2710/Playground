import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner i = new Scanner(System.in);
      	int a = i.nextInt();
      	int b = i.nextInt();
      	if(a>b)
        {
          System.out.println("num1 is the greatest number");
        }
      	else
        {
          System.out.println("num2 is the greatest number");
        }
	}
}