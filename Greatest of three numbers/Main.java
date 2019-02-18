import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
      Scanner i = new Scanner(System.in);
      int a = i.nextInt();
      int b = i.nextInt();
      int c = i.nextInt();
      if(a>b && a>c)
      {
        System.out.println(a);
      }
      else if(b>c)
        System.out.println(b);
      else
        System.out.println(c);
    }
}