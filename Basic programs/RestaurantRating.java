import java.util.*;
public class RestaurantRating
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter resterant Name : ");
		String restaurant=scan.nextLine();
		System.out.print("Enter Rating(1-5) : ");
		int rating=scan.nextInt();
		if(rating == 5)
		{
		    System.out.println("Thank You Very Much Sir!");
		}
			 else if (rating == 4)
		{
		    System.out.println("Thank You Sir!");
		}
			 else if (rating == 3)
		{
		    System.out.println("Your feedback helps us make things better.!");
		}
			else if (rating == 2)
		{
		    System.out.println("Sorry for the inconvenience, we’ll make sure to improve!");
		}
		      else if (rating == 1)
		     {
		     System.out.println("We're sorry you didn't have a great experience.");
		     }
		     else 
		     {
		         System.out.println("Invalid Rating");
		     }
    }
}
