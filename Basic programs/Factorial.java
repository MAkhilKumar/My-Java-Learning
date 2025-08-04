import java.util.*;
public class Factorial
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Number : ");
	    int number=scan.nextInt();
	    int factorial=1;
	    for(int i=1;i<=number;i++)
	    {
	        factorial=factorial * i;
	    }
		System.out.println(" Factorial of Number is "+factorial);
	}
}
