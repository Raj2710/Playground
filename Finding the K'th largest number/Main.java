import java.util.*;
class Main{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt(),i;
      	int arr[] = new int[n];
      	for( i = 0; i<n;i++)
        {
          arr[i] = in.nextInt();
        }
      	int k = in.nextInt();
      	Arrays.sort(arr);
      System.out.println(arr[n-k]);
    }   
}