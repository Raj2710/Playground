import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
      	int num1,num2,num3,max;
      	num1 = in.nextInt();
      	num2 = in.nextInt();
      	num3 = in.nextInt();
      	max = num1 > num2 ? num1 : num2;
      	max = max < num3 ? num3 : max;
      	System.out.println(max);
	}
}