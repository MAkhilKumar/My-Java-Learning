import java.util.*;
public class ArrayAverage
{
    public static double SumArray(int[] array, int n)
    {
        int sum=0;
        for(int i=0;i<=n-1;i++)
    {
            sum+=array[i];
    }
    double avg = Average(sum,n);
    return avg;
    }
    public static double Average(int sum,int n)
    {
        double average=(double)sum/n;
        return average;
    }
	public static void main(String[] args)
	{
	    
	    Scanner scan=new Scanner(System.in);
		System.out.println("enter no : ");
		int number=scan.nextInt();
		int[] array = new int [number];
		for(int i=0;i<=number-1;i++)
		{
		    array[i]=scan.nextInt();
		}
		double result=SumArray(array,number);
		System.out.print(result);
	}
}
