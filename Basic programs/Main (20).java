import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.print(" enter first number : " );
	    int a= input.nextInt();
	    System.out.print(" enter second number : " );
	    int b = input.nextInt();
	    System.out.print(" enter operater(+,-,*,/,%) : " );
	    char operator= input.next().charAt(0);
	    switch(operator)
	    {
	        case'+' :System.out.println(a+b);
	        break;
	        case '-' : System.out.println(a-b);
	        break;
	        case '*' : System.out.println(a*b);
	        break;
	        case '/' : System.out.println(a/b);
	        break;
	        case '%' : System.out.println(a%b);
	        break;
	        default : System.out.println(" wrong operation");
	    }

}
}