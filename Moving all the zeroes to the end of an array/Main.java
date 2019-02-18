import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
    	int n = in.nextInt(),i,zero=0;
    	int in_arr[] = new int[n];
      for(i=0;i<n;i++)
        in_arr[i] = in.nextInt();
      for(i=0;i<n;i++)
      {
        if(in_arr[i] == 0)
         zero++; 
        else
         System.out.print(in_arr[i] + " ");
      }
      for(i=0;i<zero;i++)
        System.out.print("0 ");
    }
}