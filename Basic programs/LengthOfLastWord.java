import java.util.*;
public class LengthOfLastWord
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Line ");
	    String  word=sc.nextLine();
	    String st=word;
	    String str=st.trim();
	    int count=0;
	    for(int i=str.length()-1;i>=0;i--)
	    {
	        if(str.charAt(i)!=' ')
	        {
	            count++;
	        }
	        else{
	            break;
	        }
	    }
		System.out.println(count);
	}
}
