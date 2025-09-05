import java.util.*;
public class TrianglePattern
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=scan.nextInt();
		for(int i=0;i<number;i++)
		{
		    for(int j=0;j<=(number-i);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<=2*(i);j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
