import java.util.*;
public class HollowRhombus
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner (System.in);
		System.out.print("enter no : ");
		int i=scan.nextInt();
		for(int n=1;n<=i;n++)
		{
		    for(int a=1;a<=(i-n);a++)
		    {
		        System.out.print(" ");
	    	}
		for(int a=1;a<=i;a++)
		{
		    if(n==1 || n==i || a==1 || a==i)
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
