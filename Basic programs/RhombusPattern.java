import java.util.*;
public class RhombusPattern
{
	public static void main(String[] args)
 {
	    Scanner scan=new Scanner (System.in);
		System.out.print("Enter No : ");
		int i=scan.nextInt();
		for(int n=1;n<=i;n++) 
	{
		        for(int a=1;a<=(i-n);a++)
		{
		        System.out.print(" ");
		}
		        for(int a=1;a<=i;a++) 
		{
		        System.out.print("*");
		}
		        System.out.println();
    }
 }
 
}