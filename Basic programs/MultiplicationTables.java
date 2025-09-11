import java.util.*;
public class MultiplicationTables
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	   System.out.print(" enter a number :");
		int number = input.nextInt();
    	System.out.print(" how many times it should multiply :");
		int a = input.nextInt();
		for(int i=1;i<a+1;i++) {
		    System.out.println(number+ "X"+ i+ "=" +number*i);
	    	}
		}
}