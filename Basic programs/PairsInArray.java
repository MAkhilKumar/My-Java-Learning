import java.util.*;
public class PairsInArray
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner (System.in);
	    System.out.print("Enter Number : ");
	    int number=scan.nextInt();
	    int array[]=new int [number];
	    for(int i=0;i<number;i++)
	    {
	        array[i]=scan.nextInt();
	    }
	    for(int i=0;i<array.length;i++){
	        int current=array[i];
	       for( int j=i+1;j<array.length;j++)
	       {
	            System.out.print("("+current +","+array[j] +")");
	        }
	        System.out.println();
	    }

	}
}
