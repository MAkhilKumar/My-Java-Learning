import java.util.*;
public class invertedPattern
{
	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.print(" Enter Number ");
	    int n=sc.nextInt();
	    int j;
	    for(int li = n;li >= 1;li--)
	    {
	        for(j=1;j<=li;j++) 
	        {
	        System.out.print("*");   
	        }
	        System.out.println();
	    }
	}
}
