import java.util.*;
public class EmailChecker
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner (System.in);
		System.out.print("Create New Email ");
		String email=scan.nextLine();
		int no=email.length();
		if(email.contains("@") && email.contains("."))
		{
		   System.out.println("Email is Created : "); 
		}
		else {
		    System.out.println("Email Not Created");
		}
	}
}
