import java.util.*;
public class Dominos
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
		System.out.println("Welcome To Domino's");
		System.out.println("Enter Which Pizza Do You Want(1/2/3/4/5) ");
		System.out.println("Margherita-₹299");
		System.out.println("Pepperoni-₹269");
		System.out.println("Veggie Delight-₹259");
		System.out.println("BBQ Chicken-₹289");
		System.out.println("Panner Tikka-₹279");
		int pizza=scan.nextInt();
		System.out.println("How Many Pizza's");
		int quan=scan.nextInt();
		int price=0;
		switch(pizza)
		{
		    case 1:
		        price=299;
		        break;
		         case 2:
		        price=269;
		        break;
		         case 3:
		        price=259;
		        break;
		         case 4:
		        price=289;
		        break;
		         case 5:
		        price=279;
		        break;
		        default :
		        System.out.println("Invalid Order!");
		}
		int total=price*quan;
		System.out.println("Your Total Bill is ₹"+total);
		System.out.println("Thank You!");
		
		
	}
}
