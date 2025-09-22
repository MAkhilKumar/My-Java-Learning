import java.util.*;
public class PalindroneStrings
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner (System.in);
		System.out.print("Enter String : ");
		String palin=scan.nextLine();
	    palin=palin.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    String rev=new StringBuilder(palin).reverse().toString();
	
	    if(palin.equals(rev))
	    {
	        System.out.print("It Is A Palindrone");
	    }
	    else
	    {
	        System.out.print("It Is Not A Palindrone");
	    }
	}
}
