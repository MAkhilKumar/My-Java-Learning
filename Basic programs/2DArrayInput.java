import java.util.*;
public class 2DArrayInput
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Row Value : ");
	    int rows=scan.nextInt();
	    System.out.print("Enter Cols Value : ");
	    int cols=scan.nextInt();
	    System.out.print("Enter Array Input : ");
	    
	    int [][] array = new int [rows][cols];
	    
	        
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
	            System.out.print(array[i][j]);
	        }
	            System.out.println();
	    }
		
	}
}
