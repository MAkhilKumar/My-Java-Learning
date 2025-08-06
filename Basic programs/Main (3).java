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
	    Scanner scan=new Scanner (System.in);
	    
	    int[][] mat1=new int[2][2];
	    int rows=mat1.length;
	    int col=mat1[0].length;
	    System.out.print("Enter Array Inputs ");
	    int[][] result=new int [2][2];
	    for(int i=0;i<rows;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	        mat1[i][j]=scan.nextInt();    
	        }
	        
	    }
	    int [][] mat2=new int [2][2];
	     for(int i=0;i<rows;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	        mat2[i][j]=scan.nextInt();    
	        }
	        
	    }
	   
	     for(int i=0;i<rows;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	           result[i][j]=mat1[i][j] +mat2[i][j]; 
	        }
	    }
	    for(int i=0;i<rows;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	         System.out.print(result[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    
	}
}
