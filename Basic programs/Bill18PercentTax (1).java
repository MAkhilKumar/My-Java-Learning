import java.util.*;
public class Bill18PercentTax
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    System.out.print ("Enter a amount : ");
	    float item=input.nextFloat();
	    System.out.print ("Enter a amount for secod item  : ");
	    float thing= input.nextFloat();
	    System.out.print("Enter a amount for Third Item : ");
	    float object=input.nextFloat();
	    float total = item + thing + object;
	    System.out.println(" bill is " +total);
	    float newtotal= total + (0.18f * total);
	    System.out.println(" bill with 18% tax is " +newtotal);
	}
}
