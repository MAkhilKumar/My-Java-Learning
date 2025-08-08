import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int sum=0;
		System.out.print("Enter Row Number : ");
		int rows=scan.nextInt();
		System.out.print("Enter Colums Number : ");
		int col=scan.nextInt();
		int [][] array=new int [rows][col];
		System.out.print("Enter array inputs ");
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        array[i][j]=scan.nextInt();
		    }
		}
		for(int i=0;i<rows;i++)
		{
		    sum=sum+array[i][i];
		}
		System.out.println("The trace of matrix is  "+sum);
	}
}
