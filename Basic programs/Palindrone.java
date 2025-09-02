import java.util.*;
public class Palindrone
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter no : ");
	    int n=sc.nextInt();
	    int rev=0;
	    int dupli=n;
	    while(n>0)
	    {
	        int last=n%10;
	        rev=(rev * 10) + last;
	        n=n/10;
	    }
	    System.out.println(rev);
        if (rev == dupli)
        {
            System.out.println("palindrone");
        } else
        {
            System.out.println("it is not");
        }
	}
}