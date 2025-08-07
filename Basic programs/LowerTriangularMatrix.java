
import java.util.*;
public class LowerTriangularMatrix
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    
	
		int [][] array=new int [3][3];
		int rows=array.length;
		int col=array[0].length;
		System.out.print("Enter Array Input : ");
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        array[i][j]=scan.nextInt();
		       
		    }
		}
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		          if(i < j )
		        {
		            System.out.print("0 ");
		        } else {
		            System.out.print(array[i][j]+" ");
		        }
		    }
		            System.out.println();
		}

	}
}
