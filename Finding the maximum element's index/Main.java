import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),i;
    int array[]=new int[n];
    for(i=0;i<n;i++)
    {
      array[i] = in.nextInt();
    }
    System.out.println(find_max_index(array,n)); 
  }
  public static int find_max_index(int array[],int n)
  {
    int i,max=0;
    for(i=1;i<n;i++)
    {
      if(array[i]>array[max])
      {
        max=i;
      }
    }
    return max;
  }
}