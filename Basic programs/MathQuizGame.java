import java.util.*;
public class MathQuizGame
{
    public static boolean  random(Scanner scan,int n)
    {
        Random ran=new Random();
        int number1=ran.nextInt(n);
        int number2=ran.nextInt(n);
        int operator=ran.nextInt(4);
        int answer=0;
        String question;
        if(operator == 0)
        {
            answer=number1 + number2;
            question = "+";    
        }
        else if(operator == 1)
        {
            answer=number1-number2;
            question = "-";    
        } else if(operator == 2)
        {
            answer=number1 * number2;
            question = "*";    
        } else{
            answer=number1/number2;
            question = "/";    
        }
        System.out.print("Solve this  "+number1+ " " +question+ " " +number2+ " = ");
        int user=scan.nextInt();
        if ( answer == user)
        {
            return true;
        } else
        {
            return false;
        }
       
    }
    
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
		System.out.print("Enter the Limit Number : ");
		int number=input.nextInt();
		int score=0;
		for(int i=0;i<5;i++)
		{
		  
		    boolean check = random(input,number);
		    if(check == true)
		    {
		        score++;
		    }
		 
		   
		}
		if(score == 5)
		{
		 System.out.print(" Congratultions ! You Scored " +score  + " out of 5 ");
		}
		else if(score == 0)
		{
		    System.out.print(" Better Luck Next Time ");
		    
		}
		else 
		{
		    System.out.print(" You Scored " +score  + " out of 5 ");
		}
	}
}
