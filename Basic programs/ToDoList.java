import java.util.*;
public class ToDoList
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Number of tasks : ");
	    int no=scan.nextInt();
	    scan.nextLine();
	   
	    String[] list=new String[no];
	    for(int i=0;i<no;i++)
	    {
	       	System.out.print("Enter Task : ");
	        list[i]=scan.nextLine();
	    }
	    for(int i=0;i<no;i++)
	    {
	        System.out.println( i+1+"."+list[i]);
	    }
	 
	}
}
