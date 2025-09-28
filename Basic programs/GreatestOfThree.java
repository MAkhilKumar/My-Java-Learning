import java.util.*;
public class GreatestOfThree
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter numbers : ");
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int number3=scan.nextInt();
		if(number1>number2 && number1>number3)
		{
		    System.out.print("Number1 is greater "+number1);
		}
		else if(number2>number1 && number2>number3)
		{
		    System.out.println("Number2 is greater : "+number2);
		}
		else if(number3>number1 && number3>number2)
		{
		    System.out.println("Number3 is greater : "+number3);
		}
		else 
		{
		    System.out.println("All are equal ");
		}
	}
}
