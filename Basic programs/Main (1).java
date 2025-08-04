import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int sum=0;
		for(int i=1;i<number;i++)
		{
		    if(number%i==0)
		    {
		        sum=sum +i;
		    }
		}
		if(sum == number )
		{
		    System.out.println("It Is A Perfect Number "+sum);
		}
		else 
		{
		    System.out.println("Not A Perfect Number ");
		}
	}
}
