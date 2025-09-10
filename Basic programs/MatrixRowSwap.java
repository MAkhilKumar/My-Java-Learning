import java.util.*;
public class MatrixRowSwap
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	   
		System.out.print("Enter Rows Number : ");
		int rows=scan.nextInt();
		System.out.print("Enter Colums Number : ");
		int col=scan.nextInt();
		int [][] array=new int [rows][col];
		int [][] result=new int [rows][col];
     	int row1=0;
     	int row2=2;
     	System.out.println("Enter Array Input ");
     	for(int i=0;i<rows;i++)
     	{
     	    for(int j=0;j<col;j++)
     	    {
     	    array[i][j]=scan.nextInt();
     	    }
     	}
		for(int i=0;i<rows;i++)
		{
		   result[i][i]= array[row1][i];
		   array[row1][i]= array[row2][i];
		   array[row2][i]= result[i][i];
		   
		}
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        System.out.print(array[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
