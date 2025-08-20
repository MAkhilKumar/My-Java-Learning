import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("enter no : ");
		int i=scan.nextInt();
		for(int n=1;n<=i;n++)
		{
		    for(int j=1;j<=(i-n);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=(2*n)-1;j++)
		    {
		    System.out.print("*");
		    }
		    System.out.println();
		}
		for(int n=i;n>=1;n--)
		{
		    for(int j=1;j<=i-n;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=(2*n)-1;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
