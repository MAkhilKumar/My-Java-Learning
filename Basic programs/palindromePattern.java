import java.util.*;
public class palindromePattern
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner (System.in);
  		System.out.print("enter number : ");
  		int no=input.nextInt();
	    for(int i=1;i<=no;i++)
	    {
		    for(int j=1;j<=no-i;j++)
        {
            System.out.print(" ");
        }
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
