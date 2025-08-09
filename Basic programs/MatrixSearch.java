import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Inputs ");
		int [][] matrix=new int[3][3];
		int rows=matrix.length;
		int col=matrix[0].length;
		boolean check=false;
		for(int i=0;i<rows;i++)
		{
		    for(int  j=0;j<col;j++)
		    {
		    matrix[i][j]=scan.nextInt();
		    }
		}
		System.out.println("Enter Number for index  ");
		int number=scan.nextInt();
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
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
