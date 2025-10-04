import java.util.*;
public class MarksAverage
{
    	public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Subjects : ");
	    int subjects=sc.nextInt();
		int marks[]=new int[subjects];
		int sum=0;
		float average=0;
		for(int i=0;i<subjects;i++)
		{
		    marks[i]=sc.nextInt();
		    sum+=marks[i];
		    
		}
		average=(float)sum/subjects;
		System.out.println("The Average is = "+average);
	}
}
