import java.util.*;
public class DiamondPattern
{
		public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Number : ");
	    int no=scan.nextInt();
		 for(int i=0;i<no;i++)
          {
              for(int j=i;j<no;j++)
              {
                  System.out.print(" ");
              }
              for(int j=0;j<2*i-1;j++)
              {
                  System.out.print("*");
              }
              System.out.println();
          }
          for(int i=0;i<no;i++)
          {
              for(int j=0;j<i;j++)
              {
                  System.out.print(" ");
              }
              for(int j=0;j<(2*(no-i)-1);j++)
              {
                  System.out.print("*");
              }
              System.out.println();
          }
        
	}
}


