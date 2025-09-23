import java.util.*;
public class BinaryToDecimal
{
    public static int Binary(int number) {
        int power=0;
        int decimal=0;
        while(number>0) {
            int last = number%10;
            decimal=decimal +( last * (int)Math.pow(2,power));
            power++;
            number = number /10;
        }
        return decimal;
    
    }
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Binary  Number : ");
		int number = scan.nextInt();
		int result = Binary(number);
		System.out.println("Binary to decimal " +result);
	}
}
