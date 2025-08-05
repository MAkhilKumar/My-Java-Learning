import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=scan.nextInt();
		int rev=0;
		int store=number;
		while(number >0)
		{
		    int last=number%10;
		    rev=(rev * 10) + last;
		    number=number/10;
		}
	
		
		    System.out.println("Reverse Number is " +rev);
		
	}
}
