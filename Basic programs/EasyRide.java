import java.util.*;
public class EasyRide
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.print("Where You Want To Go? ");
		String place=scan.nextLine();
		System.out.print("Your Current Location? ");
		String current=scan.nextLine();
		System.out.print("Enter The Distance(In Km's) ");
		double dist=scan.nextDouble();
		double fare=1;
		System.out.println("Select Vehicle\n 1.Bike \n 2.Auto ");
		int transport=scan.nextInt();
		if(transport == 1 )
		{
		    fare=dist*8;
		}
		else if (transport == 2)
		{
		    fare=dist*15;
		}
		else 
		{
		    System.out.println("Invalid");
		}
		System.out.println("\nFrom Location : "+current);
		System.out.println("To Location : "+place);
		System.out.println("Distance : "+dist);
		System.out.println("Your Total Fare is "+fare);
	}
}
