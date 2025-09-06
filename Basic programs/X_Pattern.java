import java.util.*;
public class X_Pattern
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int no=scan.nextInt();
		for(int i=1;i<=no;i++)
		{
		    for(int j=1;j<=no;j++)
		    {
		        if(j==i || j==(no-i+1))
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
	}
}
