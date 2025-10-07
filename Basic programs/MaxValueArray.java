import java.util.*;
public class MaxValueArray
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner (System.in);
		System.out.print("Enter Number : ");
		int min=Integer.MIN_VALUE;
		int number=scan.nextInt();
		int array[]=new int [number];
		for(int i=0;i<=number-1;i++)
		{
		    array[i]=scan.nextInt();
		}
		for(int i=0;i<=number-1;i++)
		{
		    if(array[i]> min)
		    {
		        min = array[i];
		    } 
		}
		System.out.print("maximum value " +min);
	}
}
