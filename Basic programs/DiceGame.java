import java.util.*;
public class DiceGame
{
	public static void main(String[] args)
	{
	    Scanner input=new Scanner (System.in);
		System.out.print("Guess the dice  number : ");
		int number=input.nextInt();
		Random ran=new Random();
		int dice=ran.nextInt(6)+1;
		
		if(number == dice)
		{
		    System.out.println("Congratulations its correct !"+dice);
		} else
		{
		    System.out.println("Better luck next time ");
		}
		System.out.println(dice);
	}
}
