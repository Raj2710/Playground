import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       Scanner in = new Scanner(System.in);
       String str_1 = in.nextLine();
       String str_rev ="";
       int i,count = 0,front=0,back = str_1.length()-1;
       for(i=0;i<str_1.length();i++)
       {
         str_rev = str_rev + str_1.charAt(back--);
       }
      if(str_1.equals(str_rev))
      {
        System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }
    } 
}