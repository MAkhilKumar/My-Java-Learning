import java.util.*;
public class ButterFlyPattern
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int no=scan.nextInt();
		for(int i=1;i<no;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=1;j<=2*(no-i);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=no;i>=1;i--)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=1;j<=2*(no-i);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
