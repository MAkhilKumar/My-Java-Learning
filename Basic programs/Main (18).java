import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
//	  0 and 1 triangle
        System.out.print("Enter Number : ");
        int no=scan.nextInt();
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1 ");
                }
                else 
                {
                    System.out.print("0 ");
                }
              
            }
              System.out.println();
        }
    
	}
}
