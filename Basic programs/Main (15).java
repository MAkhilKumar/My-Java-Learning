import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Number : ");
	    int no=scan.nextInt();
		 int sum=1;
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
        
	}
}
