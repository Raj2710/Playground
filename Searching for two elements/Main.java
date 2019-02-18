import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s1,s2,count,i;
      int array[] = new int[n];
      for(i=0;i<n;i++)
      {
        array[i]=in.nextInt();
      }
      s1 = in.nextInt();
      s2 = in.nextInt();
      search(array,n,s1);
      search(array,n,s2);
    }
  public static int search(int array[],int n,int s)
  {
    int i;
    for(i=0;i<n;i++)
    {
      if(array[i]==s)
      {
        System.out.println(i);
        return 0;
      }
    }
    System.out.println("-1");
    return 0;
  }
}