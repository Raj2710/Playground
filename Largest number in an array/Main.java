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
      System.out.println(max(array,n));
    }
  public static int max(int array[],int n)
  {
    int i,max=array[0];
    for(i=1;i<n;i++)
    {
      if(array[i]>max)
      {
        max=array[i];
      }
    }
 	return max;
  }
}