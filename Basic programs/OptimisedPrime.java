import java.util.*;
public class OptimisedPrime
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    boolean temp=false;
	    System.out.print("Enter  Number : ");
	    int no=scan.nextInt();
	    for(int i=2;i<(no/2)+1;i++)
	    {
	        if(no%2 == 0)
	        {
	            temp = true;
	            break;
	        }
	    }
	    if(temp == false)
	    {
	        System.out.println("Prime Number ");
	    }
	    else
	    {
		System.out.println("Not Prime ");
	    }
	}
}
