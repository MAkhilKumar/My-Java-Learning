

import java.util.*;
public class SubtractionOfTwoMatrices
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int rows=scan.nextInt();
		System.out.print("Enter Colums : ");
		int col=scan.nextInt();
		int[][] mat1=new int [rows][col];
		int[][] mat2=new int [rows][col];
		int[][] result=new int [rows][col];
		System.out.println("Enter Values for Matrice 1 ");
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        mat1[i][j]=scan.nextInt();
		    }
		}
		System.out.println("Enter Values for Matrice 2 ");
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
		        result[i][j]=mat1[i][j] - mat2[i][j];
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
