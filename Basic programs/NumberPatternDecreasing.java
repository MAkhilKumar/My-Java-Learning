import java.util.*;
public class NumberPatternDecreasing
{
	public static void main(String[] args)
	{
	        Scanner scan=new Scanner(System.in);
		    System.out.print("Enter Number : ");
		    int num=scan.nextInt();
	     	for(int i=1;i<=num;i++)
		{
		    for(int j=1;j<=num-i+1;j++)
		  {
		    System.out.print(j+" ");
		  }
		    System.out.println();
		}
	}
}
