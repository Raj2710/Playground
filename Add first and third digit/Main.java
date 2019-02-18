import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
      	int num1 = input.nextInt();
      	int first_num = num1/100;
      	int second_num = num1%10;
      	System.out.println(first_num+second_num);
	}
}