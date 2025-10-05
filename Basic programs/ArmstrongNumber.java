import java.util.*;
public class ArmstrongNumber
{

	public static void main(String[] args) 
	{
	    Scanner scan= new Scanner (System.in);
		System.out.print("enter number : ");
		int number = scan.nextInt();
		int counter =0;
		int store=number;
		while(store >0)
		{
		 store= store /10;
		 counter ++;
		}
		
		int sum=0;
		int copy=number;
		while(copy >0)
		{
		    int last = copy %10;
		    int multiply=(int)Math.pow(last,counter);
		  
		    sum += multiply;
		    copy = copy /10;
		}
		
		if (number == sum)
		{
		    System.out.println(number +" it is a ArmStrong number ");
		} else
		{
		    System.out.println(number+"  is not armstrong number ");
        }
	}
}
	
