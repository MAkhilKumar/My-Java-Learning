/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=scan.nextInt();
		int rev=0;
		int store=number;
		while(number >0)
		{
		    int last=number%10;
		    rev=(rev * 10) + last;
		    number=number/10;
		}
	
		
		    System.out.println("Reverse Number is " +rev);
		
	}
}
