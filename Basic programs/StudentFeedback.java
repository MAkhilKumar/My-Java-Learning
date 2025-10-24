import java.util.*;
public class StudentFeedback
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter How Many Subjects You Have ? ");
		int sub=scan.nextInt();
		scan.nextLine();
		int rating[]= new int[sub];
		System.out.println("Enter Subjects Names ");
		String array[]=new String[sub];
		for(int i=0;i<sub;i++)
		{
		    array[i]=scan.nextLine();
		}
			for(int i=0;i<sub;i++)
		{
		    System.out.println("Your Feedback on "+array[i]);
		    rating[i]=scan.nextInt();
		}
			for(int i=0;i<sub;i++)
		{
		    System.out.println("Rating on "+array[i] +" "+rating[i]);
		}
		
	}
}
