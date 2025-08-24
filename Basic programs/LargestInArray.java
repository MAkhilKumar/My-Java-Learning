import java.util.*;
public class LargestInArray
{
    public static int LargestArray(int number[]) 
    {
        int smallest= Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(smallest < number[i])
            {
                smallest = number[i];
            }
        }
        return smallest;
    }
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Array Limit : ");
	    int no=scan.nextInt();
	    int number[] =new int [no];
	    System.out.print("Enter Arrays : ");
	     for(int i=0;i<no;i++)
	     {
	         number[i]=scan.nextInt();
	     }
	     int result=LargestArray(number);
		
		System.out.println("The Largest Number is " +result);
		
	}
}
