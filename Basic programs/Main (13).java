/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int i=0;
	    int j=0;
		System.out.println("Enter Array Inputs ");
		int [][] matrix=new int[3][3];
		int rows=matrix.length;
		int col=matrix[0].length;
		boolean check=false;
		for( i=0;i<rows;i++)
		{
		    for( j=0;j<col;j++)
		    {
		    matrix[i][j]=scan.nextInt();
		    }
		}
		System.out.println("Enter Number for index  ");
		int number=scan.nextInt();
		for( i=0;i<rows;i++)
		{
		    for( j=0;j<col;j++)
		    {
		        if(matrix[i][j]== number )
		        {
		       System.out.print("Elements found at index "+"("+i+","+j+")");
		      check=true;
		      break;
		        }
		      
		    }
		    
		}
	    	if(check == false )
		    {
		    System.out.print("Not found ");
		    }
		    
	    	
		    
	}
}
