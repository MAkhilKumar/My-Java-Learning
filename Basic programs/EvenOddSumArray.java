import java.util.*;
public class EvenOddSumArray
{
	public static void main(String[] args) {
	    int even=0;
	    int odd=0;
	    Scanner scan=new Scanner (System.in);
		System.out.print("enter number : ");
		int number=scan.nextInt();
		int array[]=new int [number];
		for(int i=0;i<=number-1;i++){
		    array[i]=scan.nextInt();
		}
		for(int i=0;i<=number-1;i++){
		    if(array[i]%2 == 0){
		       even += array[i];
		    } else {
		        odd+= array[i];
		    }
		}
		 System.out.println("even sum of number is " +even);
		  System.out.print("Odd sum of number is " +odd);
	}
}
