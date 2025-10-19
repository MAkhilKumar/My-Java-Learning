import java.util.*;
public class MatrixSquaring
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of Array ");
		int rows=scan.nextInt();
		int cols=scan.nextInt();
		int square[][]=new int [rows][cols];
		int [][]array=new int [rows][cols];
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<cols;j++)
		    {
		        array[i][j]=scan.nextInt();
		    }
		}
			for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<cols;j++)
		    {
		     square[i][j] =array[i][j]*array[i][j];
		      System.out.print(square[i][j]+" " );
		    }
		    System.out.println();
		}
	}
}
