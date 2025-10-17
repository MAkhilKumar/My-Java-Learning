import java.util.*;
public class LibraryReturn
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Book Name ");
	    String name=scan.nextLine();
		System.out.print("Are You Here To Return The Borrowed Book?(Yes/No) ");
		String borrow=scan.nextLine().toLowerCase();
		System.out.print("Are You A Member ?(Yes/No) ");
		String member=scan.nextLine().toLowerCase();
		if(borrow.equals("yes") && member.equals("no") )
		{
		    System.out.println("You Have To Pay ₹500 For The Book !");
		}
		else if (borrow.equals("yes")&& member.equals("yes"))
		{
		    System.out.println("Here is Your Discount just pay 200");
		}
		
		else 
		{
		    System.out.println("Thank You!");
		}
		System.out.println("Your Book is "+name);
	}
}
