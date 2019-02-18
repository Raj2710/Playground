import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int c=0,flag=1;
    String str_1 = in.nextLine();
    String str_2 = in.nextLine();
    StringBuilder str1 = new StringBuilder(str_1);
    StringBuilder str2 = new StringBuilder(str_2);
    for(int i=0;i<str1.length();i++)
    {
      c=0;
      for(int j=0;j<str2.length();j++)
      {
        if(str1.charAt(i) == str2.charAt(j))
           {
             c++;
             break;
           }
      }
      if(c==0)
      {
        System.out.print(str1.charAt(i));
      }
    }
  }
}