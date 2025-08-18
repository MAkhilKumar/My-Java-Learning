import java.util.*;
public class AverageOfThreeNumbers
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner (System.in);
	    System.out.print(" enter first number : ");
		int a = input.nextInt();
		System.out.print(" enter second number : ");
		int  b = input.nextInt();
		System.out.print(" enter third number : ");
		int c = input.nextInt();
		int average =  (a + b + c) /3 ;
		System.out.println("the Average is " +average);
	}
}