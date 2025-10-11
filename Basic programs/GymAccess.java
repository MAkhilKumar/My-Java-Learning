import java.util.*;
public class GymAccess
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Are You New To Gym? " );
	    String New=scan.nextLine().toLowerCase();
	    if(New.equals("yes"))
	    {
	        System.out.println("Feel Free To Ask for Help");
	    }
	    else 
	    {
		System.out.print("Did You Paid The Membership(Yes/No)? : ");
		String member=scan.nextLine().toLowerCase();
		if(member.equals("yes"))
		{
		    System.out.print("Permission Granted");
		}
		else 
		{
		    System.out.println("Permission Denied");
		}
	    }
	}
}
