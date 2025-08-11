import java.util.*;
public class TransposeMatrix
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int [][] matrix=new int [3][3];
	    int row=matrix.length;
	    int col=matrix[0].length;
	    System.out.println("Enter Array Input ");
		for(int i=0;i<row;i++)
		{
    	    for(int j=0;j<col;j++)
    		{
    		       matrix[i][j]=scan.nextInt(); 
    		}
		}
		for(int j=0;j<col;j++)
		{
    		for(int i=0;i<row;i++)
    		{
    	        System.out.print(matrix[i][j]+" ");
    		}
		System.out.println();
		}
	}
}
