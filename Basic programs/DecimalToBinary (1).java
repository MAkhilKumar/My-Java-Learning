import java.util.*;
public class DecimalToBinary
{
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
        int power=0;
        int deci=0;
        int myNum=deci;
        while(a>0) {
            int rem=a%2;
            deci=deci+(rem) * (int) Math.pow(10,power);
            power++;
            a=a/2;
        }
        System.out.println("Decimal To Binary is "+deci);
    
	}
}