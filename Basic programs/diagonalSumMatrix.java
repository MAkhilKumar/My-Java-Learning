import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int secondiagonal=0;
	    int back=2;
		System.out.print("Enter Row NUmber ");
		int rows=scan.nextInt();
		System.out.print("Enter Colums Number ");
		int col=scan.nextInt();
		int [][]array = new int [rows][col];
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        array[i][j]=scan.nextInt();
		    }
		}
		for(int i=0;i<rows;i++)
		{
		  
		      secondiagonal= secondiagonal+ array[i][back];
		      back--;
		    
		}
		System.out.println("Second Diagonal sum is " +secondiagonal);
	}
}
