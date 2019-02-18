import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int i,j,count=1;
      	int n = in.nextInt();
      	for(i=1;i<=n;i++)
        {
		  for(j=1;j<=i;j++)
          {
			if(count%2==1)
            {
				System.out.print("*");
              	count++;
            }
            else
               {
				System.out.print("#");
              	count++;
            }
          }
          System.out.println();
        }
    }
}