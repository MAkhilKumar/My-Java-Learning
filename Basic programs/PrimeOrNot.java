import java.util.*;
public class PrimeOrNot
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter  Number : ");
	    int number=scan.nextInt();
	    boolean temp=false;
	    for(int i=2;i<number;i++)
	  {
	    if(number%i == 0)
	    {
	        temp=true;
	    }
	  }
	    if(temp == false )
	    {
	    	System.out.println("Prime Number ");
	    }
	    else
	    {
	        System.out.println("Not Prime ");
	    }
	}
}
