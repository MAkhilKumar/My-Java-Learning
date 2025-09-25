import java.util.*;
public class PrintFactors
{
    public static void Factors(int n)
    {
        for(int a=2;a<=n;a++)
        {
            if(n%a==0) {
                System.out.print(a+" ");
            }
            
        }
        System.out.println();
    }
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int numbers=scan.nextInt();
		Factors(numbers);
	}
}
