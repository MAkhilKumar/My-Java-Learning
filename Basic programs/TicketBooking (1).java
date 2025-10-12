import java.util.*;
public class TicketBooking
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Movie Name : ");
		String movie=scan.nextLine();
		System.out.print("Enter Seat Type(Regular/VIP) : ");
		String ticket =scan.nextLine().toLowerCase();
		System.out.print("Enter (Weekday/Weekend) : ");
		String day=scan.nextLine().toLowerCase();
		if(ticket.equals("regular") && day.equals("weekday"))
		{
		    System.out.println("Ticket Booked! Price: ₹300");
		}
		 else if(ticket.equals("regular") && day.equals("weekend"))
		{
		    System.out.println("Ticket Booked! Price: ₹350");
		}
			 else if (ticket.equals("vip") && day.equals("weekend"))
		{
		    System.out.println("Ticket Booked! Price: ₹450");
		}
			 else if (ticket.equals("vip") && day.equals("weekday"))
		{
		    System.out.println("Ticket Booked! Price: ₹400");
		}
		else {
		    System.out.println("Sorry For Inconvenience");
		}
	}
}
