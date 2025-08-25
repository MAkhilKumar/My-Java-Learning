import java.util.*;
public class SquarePattern
{
	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	     System.out.print("Enter Number : ");
	    int n=sc.nextInt();
	    for(int li = 0;li < n;li++)
	    {
	        for(int j=0;j<n;j++)
	        {
	         System.out.print("*");   
	        }
	        System.out.println();
	    }
	}
}