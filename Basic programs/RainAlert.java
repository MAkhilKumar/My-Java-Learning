import java.util.*;
public class RainAlert
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Temperature : ");
		int temp=scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Weather(Rainy,Cloudy,Sunny) : ");
		String weather=scan.nextLine().toLowerCase();
		if(weather.equals("rainy"))
		{
		    System.out.println("Take Umbrella");
		}
		else if(weather.equals("cloudy") && temp<20)
		
		{
		    System.out.println("High chances for rain");
		}
		else 
		{
		    System.out.println("Enjoy Sunny Day");
		}
		
	}
}
