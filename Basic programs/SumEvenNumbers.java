import java.util.*;
public class SumEvenNumbers
{
    public static void EvenSum(int a)
    {
        int sum=0;
        for(int b=1;b<=a;b++)
        {
            if(b%2==0)
            {
              sum+=b;
            }
        }
         System.out.println("The Sum Of Even Numbers is "+sum);
    }
	public static void main(String[] args)
	{
	    Scanner scan = new Scanner (System.in);
		System.out.print("Enter no : ");
		int a= scan.nextInt();
		EvenSum(a);
	}
}

