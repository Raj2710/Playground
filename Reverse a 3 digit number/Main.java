import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int rev=0;
    while(num1>0)
    {
      rev = (rev*10) + (num1%10);
      num1=num1/10;
    }
    System.out.println(rev);
  }
}