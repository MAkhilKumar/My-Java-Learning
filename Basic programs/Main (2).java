/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Number : ");
	    int number=scan.nextInt();
	    int factorial=1;
	    for(int i=1;i<=number;i++)
	    {
	        factorial=factorial * i;
	    }
		System.out.println(" Factorial pf Number is "+factorial);
	}
}
