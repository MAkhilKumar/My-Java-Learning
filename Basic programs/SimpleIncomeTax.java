import java.util.*;
public class SimpleIncomeTax
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Income : ");
	    int income= input.nextInt();
	    int tax =0;
	    if (income< 500000)
	    {
	        tax =0;
	    }  
	else  if ((income>= 500000) && (income < 1000000))
	{
		    tax=(int)  (income * 0.2);
	}
	else 
	{
	    tax = (int) (income * 0.3);
    }
	    System.out.println("Your Income is "+income);
	    System.out.println("The Tax is "+tax);
    }
}