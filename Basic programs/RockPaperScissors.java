import java.util.*;
public class RockPaperScissors
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Choose ");
		System.out.println("(Rock,Paper,Scissors)");
		Random ran=new Random();
		String user=scan.nextLine().toLowerCase();
		String []npc={"rock","paper","scissors"};
		String randon=npc[ran.nextInt(npc.length)];
		if(user.equals(randon))
		{
		    System.out.println("Tie");
		}
		    else if (
            (user.equals("rock") && randon.equals("scissors")) ||
            (user.equals("paper") && randon.equals("rock")) ||
            (user.equals("scissors") && randon.equals("paper"))) 
            {
            System.out.println("You Won!");
	}
		else {
		    System.out.println("You Lost!");
		}
	}
}
