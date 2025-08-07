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
	    int sum=0;
	    int [][]array=new int [3][3];
	    int rows=array.length;
	    int col=array[0].length;
	    int[][] result=new int [3][3];
		System.out.print("Enter Matrice Input  : ");
		for(int i=0;i<rows;i++){
		    for(int j=0;j<col;j++){
		        array[i][j]=scan.nextInt();
		        sum =sum+ array[i][j];
		    }
		    	System.out.print("The Sum Of Matrice is : "+sum);
		    	sum=0;
		}
	
	}
}
