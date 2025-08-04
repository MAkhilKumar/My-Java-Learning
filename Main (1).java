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
	    System.out.print("Enter  Number : ");
	    int number=scan.nextInt();
	    boolean temp=false;
	    for(int i=2;i<number;i++)
	  {
	    if(number%i == 0)
	    {
	        temp=true;
	    }
	  }
	    if(temp == false )
	    {
	    	System.out.println("Prime Number ");
	    }
	    else
	    {
	        System.out.println("Not Prime ");
	    }
	}
}