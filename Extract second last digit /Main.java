import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
      	int num1 = input.nextInt();
      	num1 = num1/10;
      	System.out.println(num1%10);
	}
}