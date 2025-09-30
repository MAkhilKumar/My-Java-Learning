import java.util.*;
public class SumOddNumbers
{
    public static void Oddno(int a)
    {
        int sum=0;
        for(int b=1;b<=a;b++)
        {
            if(b%2!=0)
            {
              sum+=b;
            }
        }
         System.out.println("The Sum Of Odd Numbers is "+sum);
    }
	public static void main(String[] args)
	{
	    Scanner scan = new Scanner (System.in);
		System.out.print("Enter no : ");
		int a= scan.nextInt();
		Oddno(a);
	}
}

