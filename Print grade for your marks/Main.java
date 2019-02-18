import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner i = new Scanner(System.in);
    int mark = i.nextInt();
    if(mark>=45)
    {
      if(mark==45)
        System.out.println("E");
      if(mark >=85)
        System.out.println("A");
      if(mark>=75 && mark<85)
        System.out.println("B");
      if(mark>=65 && mark<75)
        System.out.println("C");
      if(mark>=55 && mark<65)
        System.out.println("D");
    }
    else
      System.out.println("Fail");
    }
}