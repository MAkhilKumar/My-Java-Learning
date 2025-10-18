import java.util.*;
public class IceCreamOrder
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    String loop="yes";
	    while(loop.equals("yes"))
	    {
		System.out.println("Which Ice-Cream Flavour do you want ");
		System.out.println("Chocolate,Vanilla,Butterscotch");
		String flavour=scan.nextLine().toLowerCase();
		System.out.println("How Many Ice-Creams Do you Want Sir! ");
		int number=scan.nextInt();
		scan.nextLine();
		if(flavour.equals("chocolate"))
		{
		   System.out.println("Each one is ₹50 So "+50*number);
		    
		}
		else if(flavour.equals("vanilla"))
		{
		    System.out.println("Each one is ₹40 So "+40*number);
		    
		}
		 else if(flavour.equals("butterscotch"))
		{
		    System.out.println("Each one is ₹45 So "+45*number);
		    
		}
		else
		{
		    System.out.println("Have a Great Day Sir!");
		}
		System.out.println("Do you Want To Shop Again(Yes/No)");
		loop=scan.nextLine().toLowerCase();
		}
		 System.out.println("Thank You Sir!");
		
	}
}
